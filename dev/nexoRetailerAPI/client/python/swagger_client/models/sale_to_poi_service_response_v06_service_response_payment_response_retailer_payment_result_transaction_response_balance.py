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

class SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance(object):
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
        'amount': 'object',
        'currency': 'object',
        'sign': 'object'
    }

    attribute_map = {
        'amount': 'Amount',
        'currency': 'Currency',
        'sign': 'Sign'
    }

    def __init__(self, amount=None, currency=None, sign=None):  # noqa: E501
        """SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance - a model defined in Swagger"""  # noqa: E501
        self._amount = None
        self._currency = None
        self._sign = None
        self.discriminator = None
        self.amount = amount
        self.currency = currency
        if sign is not None:
            self.sign = sign

    @property
    def amount(self):
        """Gets the amount of this SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance.  # noqa: E501

        Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  # noqa: E501

        :return: The amount of this SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance.  # noqa: E501
        :rtype: object
        """
        return self._amount

    @amount.setter
    def amount(self, amount):
        """Sets the amount of this SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance.

        Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  # noqa: E501

        :param amount: The amount of this SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance.  # noqa: E501
        :type: object
        """
        if amount is None:
            raise ValueError("Invalid value for `amount`, must not be `None`")  # noqa: E501

        self._amount = amount

    @property
    def currency(self):
        """Gets the currency of this SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance.  # noqa: E501

        A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>  # noqa: E501

        :return: The currency of this SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance.  # noqa: E501
        :rtype: object
        """
        return self._currency

    @currency.setter
    def currency(self, currency):
        """Sets the currency of this SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance.

        A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>  # noqa: E501

        :param currency: The currency of this SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance.  # noqa: E501
        :type: object
        """
        if currency is None:
            raise ValueError("Invalid value for `currency`, must not be `None`")  # noqa: E501

        self._currency = currency

    @property
    def sign(self):
        """Gets the sign of this SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance.  # noqa: E501

        Indicates a positive or negative value.<br/>  # noqa: E501

        :return: The sign of this SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance.  # noqa: E501
        :rtype: object
        """
        return self._sign

    @sign.setter
    def sign(self, sign):
        """Sets the sign of this SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance.

        Indicates a positive or negative value.<br/>  # noqa: E501

        :param sign: The sign of this SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance.  # noqa: E501
        :type: object
        """

        self._sign = sign

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
        if issubclass(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance, dict):
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
        if not isinstance(other, SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
