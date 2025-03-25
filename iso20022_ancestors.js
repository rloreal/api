const data = {
    "name": "ServiceResponse3",
    "children": [
        {
            "name": "ServiceResponse2",
            "children": [
                {
                    "name": "ServiceResponse1"
                }
            ]
        }
    ]
};

const width = 800;
const height = 600;
const svg = d3.select("svg")
    .attr("width", width)
    .attr("height", height);

const root = d3.hierarchy(data);
const treeLayout = d3.tree().size([height, width - 160]);
treeLayout(root);

const g = svg.append("g")
    .attr("transform", "translate(40,0)");

const link = g.selectAll(".link")
    .data(root.links())
    .enter().append("path")
    .attr("class", "link")
    .attr("d", d3.linkHorizontal()
        .x(d => d.y)
        .y(d => d.x));

const node = g.selectAll(".node")
    .data(root.descendants())
    .enter().append("g")
    .attr("class", d => "node" + (d.children ? " node--internal" : " node--leaf"))
    .attr("transform", d => `translate(${d.y},${d.x})`);

node.append("circle")
    .attr("r", 8);

node.append("text")
    .attr("dy", 3)
    .attr("x", d => d.children ? -8 : 8)
    .style("text-anchor", d => d.children ? "end" : "start")
    .text(d => d.data.name);

node.on("click", function(event, d) {
    if (d.children) {
        d._children = d.children;
        d.children = null;
    } else {
        d.children = d._children;
        d._children = null;
    }
    update(root);
});

function update(source) {
    const duration = d3.event && d3.event.altKey ? 7500 : 750;

    const nodes = root.descendants().reverse();
    const links = root.links();

    const height = Math.max(500, nodes.length * barHeight);

    d3.select("svg").transition()
        .duration(duration)
        .attr("height", height);

    node.attr("transform", function(d) { return "translate(" + d.y + "," + d.x + ")"; });

    link.attr("d", d3.linkHorizontal()
        .x(d => d.y)
        .y(d => d.x));
}