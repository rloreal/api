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

class PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth(object):
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
        'birth_date': 'object',
        'city_of_birth': 'object',
        'country_of_birth': 'object',
        'province_of_birth': 'object'
    }

    attribute_map = {
        'birth_date': 'BirthDate',
        'city_of_birth': 'CityOfBirth',
        'country_of_birth': 'CountryOfBirth',
        'province_of_birth': 'ProvinceOfBirth'
    }

    def __init__(self, birth_date=None, city_of_birth=None, country_of_birth=None, province_of_birth=None):  # noqa: E501
        """PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth - a model defined in Swagger"""  # noqa: E501
        self._birth_date = None
        self._city_of_birth = None
        self._country_of_birth = None
        self._province_of_birth = None
        self.discriminator = None
        self.birth_date = birth_date
        self.city_of_birth = city_of_birth
        self.country_of_birth = country_of_birth
        if province_of_birth is not None:
            self.province_of_birth = province_of_birth

    @property
    def birth_date(self):
        """Gets the birth_date of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth.  # noqa: E501

        A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.<br/>  # noqa: E501

        :return: The birth_date of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth.  # noqa: E501
        :rtype: object
        """
        return self._birth_date

    @birth_date.setter
    def birth_date(self, birth_date):
        """Sets the birth_date of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth.

        A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.<br/>  # noqa: E501

        :param birth_date: The birth_date of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth.  # noqa: E501
        :type: object
        """
        if birth_date is None:
            raise ValueError("Invalid value for `birth_date`, must not be `None`")  # noqa: E501

        self._birth_date = birth_date

    @property
    def city_of_birth(self):
        """Gets the city_of_birth of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The city_of_birth of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth.  # noqa: E501
        :rtype: object
        """
        return self._city_of_birth

    @city_of_birth.setter
    def city_of_birth(self, city_of_birth):
        """Sets the city_of_birth of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param city_of_birth: The city_of_birth of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth.  # noqa: E501
        :type: object
        """
        if city_of_birth is None:
            raise ValueError("Invalid value for `city_of_birth`, must not be `None`")  # noqa: E501

        self._city_of_birth = city_of_birth

    @property
    def country_of_birth(self):
        """Gets the country_of_birth of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth.  # noqa: E501

        Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).<br/>  # noqa: E501

        :return: The country_of_birth of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth.  # noqa: E501
        :rtype: object
        """
        return self._country_of_birth

    @country_of_birth.setter
    def country_of_birth(self, country_of_birth):
        """Sets the country_of_birth of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth.

        Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).<br/>  # noqa: E501

        :param country_of_birth: The country_of_birth of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth.  # noqa: E501
        :type: object
        """
        if country_of_birth is None:
            raise ValueError("Invalid value for `country_of_birth`, must not be `None`")  # noqa: E501

        self._country_of_birth = country_of_birth

    @property
    def province_of_birth(self):
        """Gets the province_of_birth of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The province_of_birth of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth.  # noqa: E501
        :rtype: object
        """
        return self._province_of_birth

    @province_of_birth.setter
    def province_of_birth(self, province_of_birth):
        """Sets the province_of_birth of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param province_of_birth: The province_of_birth of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth.  # noqa: E501
        :type: object
        """

        self._province_of_birth = province_of_birth

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
        if issubclass(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth, dict):
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
        if not isinstance(other, PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
