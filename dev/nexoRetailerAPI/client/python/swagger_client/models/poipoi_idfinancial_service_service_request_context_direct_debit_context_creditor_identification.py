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

class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification(object):
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
        'creditor': 'PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor',
        'registration_identification': 'object'
    }

    attribute_map = {
        'creditor': 'Creditor',
        'registration_identification': 'RegistrationIdentification'
    }

    def __init__(self, creditor=None, registration_identification=None):  # noqa: E501
        """PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification - a model defined in Swagger"""  # noqa: E501
        self._creditor = None
        self._registration_identification = None
        self.discriminator = None
        self.creditor = creditor
        if registration_identification is not None:
            self.registration_identification = registration_identification

    @property
    def creditor(self):
        """Gets the creditor of this PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification.  # noqa: E501


        :return: The creditor of this PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification.  # noqa: E501
        :rtype: PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor
        """
        return self._creditor

    @creditor.setter
    def creditor(self, creditor):
        """Sets the creditor of this PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification.


        :param creditor: The creditor of this PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification.  # noqa: E501
        :type: PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor
        """
        if creditor is None:
            raise ValueError("Invalid value for `creditor`, must not be `None`")  # noqa: E501

        self._creditor = creditor

    @property
    def registration_identification(self):
        """Gets the registration_identification of this PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The registration_identification of this PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification.  # noqa: E501
        :rtype: object
        """
        return self._registration_identification

    @registration_identification.setter
    def registration_identification(self, registration_identification):
        """Sets the registration_identification of this PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param registration_identification: The registration_identification of this PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification.  # noqa: E501
        :type: object
        """

        self._registration_identification = registration_identification

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
        if issubclass(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification, dict):
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
        if not isinstance(other, PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
