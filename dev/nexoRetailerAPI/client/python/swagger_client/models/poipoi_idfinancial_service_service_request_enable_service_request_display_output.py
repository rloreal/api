# coding: utf-8

"""
    nexo retailer API

    API defining resources for interactions between POI and POS, using underlying nexo messages  ### Check out its awesome features:  * simply declare POS and POI * send requests to POI * monitor activity 😎 * Receive real-time information about transaction executions📈   # noqa: E501

    OpenAPI spec version: 0.1.0
    Contact: romain.loreal@lorealconsulting.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'format': 'object',
        'information_qualifier': 'object',
        'minimum_display_time': 'object',
        'message_content': 'object',
        'message_content_signature': 'PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputMessageContentSignature',
        'message_destination': 'object',
        'output_barcode': 'PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode',
        'response_required_flag': 'object'
    }

    attribute_map = {
        'format': 'Format',
        'information_qualifier': 'InformationQualifier',
        'minimum_display_time': 'MinimumDisplayTime',
        'message_content': 'MessageContent',
        'message_content_signature': 'MessageContentSignature',
        'message_destination': 'MessageDestination',
        'output_barcode': 'OutputBarcode',
        'response_required_flag': 'ResponseRequiredFlag'
    }

    def __init__(self, format=None, information_qualifier=None, minimum_display_time=None, message_content=None, message_content_signature=None, message_destination=None, output_barcode=None, response_required_flag=None):  # noqa: E501
        """PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput - a model defined in Swagger"""  # noqa: E501
        self._format = None
        self._information_qualifier = None
        self._minimum_display_time = None
        self._message_content = None
        self._message_content_signature = None
        self._message_destination = None
        self._output_barcode = None
        self._response_required_flag = None
        self.discriminator = None
        if format is not None:
            self.format = format
        if information_qualifier is not None:
            self.information_qualifier = information_qualifier
        if minimum_display_time is not None:
            self.minimum_display_time = minimum_display_time
        if message_content is not None:
            self.message_content = message_content
        if message_content_signature is not None:
            self.message_content_signature = message_content_signature
        self.message_destination = message_destination
        if output_barcode is not None:
            self.output_barcode = output_barcode
        if response_required_flag is not None:
            self.response_required_flag = response_required_flag

    @property
    def format(self):
        """Gets the format of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501

        Type of output format.<br/>- **BARC: Barcode**  : *Barcode to output in several possible format.*<br/>- **MENT: MenuEntry**  : *A text to display as a menu before requesting an input.*<br/>- **MREF: MessageReference**  : *Predefined configured messages, identified by a reference.*<br/>- **SREF: ScreenReference**  : *Screen to display identified by a reference.*<br/>- **TEXT: SimpleText**  : *Text without format attributes.*<br/>- **HTML: XHTML**  : *XHTML document which includes a subset of the XHTML output tag.*<br/>  # noqa: E501

        :return: The format of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501
        :rtype: object
        """
        return self._format

    @format.setter
    def format(self, format):
        """Sets the format of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.

        Type of output format.<br/>- **BARC: Barcode**  : *Barcode to output in several possible format.*<br/>- **MENT: MenuEntry**  : *A text to display as a menu before requesting an input.*<br/>- **MREF: MessageReference**  : *Predefined configured messages, identified by a reference.*<br/>- **SREF: ScreenReference**  : *Screen to display identified by a reference.*<br/>- **TEXT: SimpleText**  : *Text without format attributes.*<br/>- **HTML: XHTML**  : *XHTML document which includes a subset of the XHTML output tag.*<br/>  # noqa: E501

        :param format: The format of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501
        :type: object
        """

        self._format = format

    @property
    def information_qualifier(self):
        """Gets the information_qualifier of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501

        Qualification of the information to sent to an output logical device, to display or print to the Cashier or the Customer.<br/>- **CUSA: CustomerAssistance**  : *Input of the Cardholder POI interface which can be entered by the Cashier to assist the Customer.*<br/>- **DISP: Display**  : *Standard display interface.*<br/>- **DOCT: Document**  : *When the POI System wants to print specific document (check, dynamic currency conversion ...). Used by the Sale System when the printer is not located on the Sale System.*<br/>- **ERRO: Error**  : *The information is related to an error situation occurring on the message sender.*<br/>- **INPT: Input**  : *Answer to a question or information to be entered by the Cashier or the Customer, at the request of the POI Terminal or the Sale Terminal.*<br/>- **POIR: POIReplication**  : *Information displayed on the Cardholder POI interface, replicated on the Cashier interface.*<br/>- **RCPT: Receipt**  : *Where you print the Payment receipt that could be located on the Sale System or in some cases a restricted Sale ticket on the POI Terminal.*<br/>- **SOND: Sound**  : *Standard sound interface.*<br/>- **STAT: Status**  : *The information is a new state on which the message sender is entering. For instance, during a payment, the POI could display to the Cashier that POI request an authorisation to the host acquirer.*<br/>- **VCHR: Voucher**  : *Coupons, voucher or special ticket generated by the POI or the Sale System and to be printed.*<br/>  # noqa: E501

        :return: The information_qualifier of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501
        :rtype: object
        """
        return self._information_qualifier

    @information_qualifier.setter
    def information_qualifier(self, information_qualifier):
        """Sets the information_qualifier of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.

        Qualification of the information to sent to an output logical device, to display or print to the Cashier or the Customer.<br/>- **CUSA: CustomerAssistance**  : *Input of the Cardholder POI interface which can be entered by the Cashier to assist the Customer.*<br/>- **DISP: Display**  : *Standard display interface.*<br/>- **DOCT: Document**  : *When the POI System wants to print specific document (check, dynamic currency conversion ...). Used by the Sale System when the printer is not located on the Sale System.*<br/>- **ERRO: Error**  : *The information is related to an error situation occurring on the message sender.*<br/>- **INPT: Input**  : *Answer to a question or information to be entered by the Cashier or the Customer, at the request of the POI Terminal or the Sale Terminal.*<br/>- **POIR: POIReplication**  : *Information displayed on the Cardholder POI interface, replicated on the Cashier interface.*<br/>- **RCPT: Receipt**  : *Where you print the Payment receipt that could be located on the Sale System or in some cases a restricted Sale ticket on the POI Terminal.*<br/>- **SOND: Sound**  : *Standard sound interface.*<br/>- **STAT: Status**  : *The information is a new state on which the message sender is entering. For instance, during a payment, the POI could display to the Cashier that POI request an authorisation to the host acquirer.*<br/>- **VCHR: Voucher**  : *Coupons, voucher or special ticket generated by the POI or the Sale System and to be printed.*<br/>  # noqa: E501

        :param information_qualifier: The information_qualifier of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501
        :type: object
        """

        self._information_qualifier = information_qualifier

    @property
    def minimum_display_time(self):
        """Gets the minimum_display_time of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501

        Number of objects represented as an integer.<br/>  # noqa: E501

        :return: The minimum_display_time of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501
        :rtype: object
        """
        return self._minimum_display_time

    @minimum_display_time.setter
    def minimum_display_time(self, minimum_display_time):
        """Sets the minimum_display_time of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.

        Number of objects represented as an integer.<br/>  # noqa: E501

        :param minimum_display_time: The minimum_display_time of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501
        :type: object
        """

        self._minimum_display_time = minimum_display_time

    @property
    def message_content(self):
        """Gets the message_content of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501

        Specifies a character string with a maximum length of 20, 000 characters.<br/>  # noqa: E501

        :return: The message_content of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501
        :rtype: object
        """
        return self._message_content

    @message_content.setter
    def message_content(self, message_content):
        """Sets the message_content of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.

        Specifies a character string with a maximum length of 20, 000 characters.<br/>  # noqa: E501

        :param message_content: The message_content of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501
        :type: object
        """

        self._message_content = message_content

    @property
    def message_content_signature(self):
        """Gets the message_content_signature of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501


        :return: The message_content_signature of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501
        :rtype: PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputMessageContentSignature
        """
        return self._message_content_signature

    @message_content_signature.setter
    def message_content_signature(self, message_content_signature):
        """Sets the message_content_signature of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.


        :param message_content_signature: The message_content_signature of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501
        :type: PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputMessageContentSignature
        """

        self._message_content_signature = message_content_signature

    @property
    def message_destination(self):
        """Gets the message_destination of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501

        Destination of the message.<br/>- **CDSP: CardholderDisplay**  : *Cardholder display or interface.*<br/>- **CRCP: CardholderReceipt**  : *Cardholder receipt.*<br/>- **MDSP: MerchantDisplay**  : *Merchant display or interface.*<br/>- **MRCP: MerchantReceipt**  : *Merchant receipt.*<br/>- **CRDO: OtherCardholderInterface**  : *Other interface of the cardholder, for instance e-mail or smartphone message.*<br/>  # noqa: E501

        :return: The message_destination of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501
        :rtype: object
        """
        return self._message_destination

    @message_destination.setter
    def message_destination(self, message_destination):
        """Sets the message_destination of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.

        Destination of the message.<br/>- **CDSP: CardholderDisplay**  : *Cardholder display or interface.*<br/>- **CRCP: CardholderReceipt**  : *Cardholder receipt.*<br/>- **MDSP: MerchantDisplay**  : *Merchant display or interface.*<br/>- **MRCP: MerchantReceipt**  : *Merchant receipt.*<br/>- **CRDO: OtherCardholderInterface**  : *Other interface of the cardholder, for instance e-mail or smartphone message.*<br/>  # noqa: E501

        :param message_destination: The message_destination of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501
        :type: object
        """
        if message_destination is None:
            raise ValueError("Invalid value for `message_destination`, must not be `None`")  # noqa: E501

        self._message_destination = message_destination

    @property
    def output_barcode(self):
        """Gets the output_barcode of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501


        :return: The output_barcode of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501
        :rtype: PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode
        """
        return self._output_barcode

    @output_barcode.setter
    def output_barcode(self, output_barcode):
        """Sets the output_barcode of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.


        :param output_barcode: The output_barcode of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501
        :type: PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode
        """

        self._output_barcode = output_barcode

    @property
    def response_required_flag(self):
        """Gets the response_required_flag of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501

        A flag indicating a True or False value.<br/>  # noqa: E501

        :return: The response_required_flag of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501
        :rtype: object
        """
        return self._response_required_flag

    @response_required_flag.setter
    def response_required_flag(self, response_required_flag):
        """Sets the response_required_flag of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.

        A flag indicating a True or False value.<br/>  # noqa: E501

        :param response_required_flag: The response_required_flag of this PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput.  # noqa: E501
        :type: object
        """

        self._response_required_flag = response_required_flag

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
