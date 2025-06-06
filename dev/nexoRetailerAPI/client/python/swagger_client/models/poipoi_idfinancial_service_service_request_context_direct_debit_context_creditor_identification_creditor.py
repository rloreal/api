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

class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor(object):
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
        'any_bic': 'object',
        'name_and_address': 'PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress',
        'proprietary_identification': 'PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification'
    }

    attribute_map = {
        'any_bic': 'AnyBIC',
        'name_and_address': 'NameAndAddress',
        'proprietary_identification': 'ProprietaryIdentification'
    }

    def __init__(self, any_bic=None, name_and_address=None, proprietary_identification=None):  # noqa: E501
        """PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor - a model defined in Swagger"""  # noqa: E501
        self._any_bic = None
        self._name_and_address = None
        self._proprietary_identification = None
        self.discriminator = None
        if any_bic is not None:
            self.any_bic = any_bic
        if name_and_address is not None:
            self.name_and_address = name_and_address
        if proprietary_identification is not None:
            self.proprietary_identification = proprietary_identification

    @property
    def any_bic(self):
        """Gets the any_bic of this PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor.  # noqa: E501

        Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362: 2014 - \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".<br/>  # noqa: E501

        :return: The any_bic of this PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor.  # noqa: E501
        :rtype: object
        """
        return self._any_bic

    @any_bic.setter
    def any_bic(self, any_bic):
        """Sets the any_bic of this PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor.

        Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362: 2014 - \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".<br/>  # noqa: E501

        :param any_bic: The any_bic of this PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor.  # noqa: E501
        :type: object
        """

        self._any_bic = any_bic

    @property
    def name_and_address(self):
        """Gets the name_and_address of this PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor.  # noqa: E501


        :return: The name_and_address of this PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor.  # noqa: E501
        :rtype: PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress
        """
        return self._name_and_address

    @name_and_address.setter
    def name_and_address(self, name_and_address):
        """Sets the name_and_address of this PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor.


        :param name_and_address: The name_and_address of this PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor.  # noqa: E501
        :type: PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress
        """

        self._name_and_address = name_and_address

    @property
    def proprietary_identification(self):
        """Gets the proprietary_identification of this PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor.  # noqa: E501


        :return: The proprietary_identification of this PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor.  # noqa: E501
        :rtype: PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification
        """
        return self._proprietary_identification

    @proprietary_identification.setter
    def proprietary_identification(self, proprietary_identification):
        """Sets the proprietary_identification of this PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor.


        :param proprietary_identification: The proprietary_identification of this PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor.  # noqa: E501
        :type: PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification
        """

        self._proprietary_identification = proprietary_identification

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
        if issubclass(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor, dict):
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
        if not isinstance(other, PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
