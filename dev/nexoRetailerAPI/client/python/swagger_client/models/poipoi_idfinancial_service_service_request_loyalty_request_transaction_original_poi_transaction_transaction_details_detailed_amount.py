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

class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount(object):
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
        'amount_goods_and_services': 'object',
        'cash_back': 'object',
        'fees': 'object',
        'gratuity': 'object',
        'rebate': 'object',
        'surcharge': 'object',
        'value_added_tax': 'object'
    }

    attribute_map = {
        'amount_goods_and_services': 'AmountGoodsAndServices',
        'cash_back': 'CashBack',
        'fees': 'Fees',
        'gratuity': 'Gratuity',
        'rebate': 'Rebate',
        'surcharge': 'Surcharge',
        'value_added_tax': 'ValueAddedTax'
    }

    def __init__(self, amount_goods_and_services=None, cash_back=None, fees=None, gratuity=None, rebate=None, surcharge=None, value_added_tax=None):  # noqa: E501
        """PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount - a model defined in Swagger"""  # noqa: E501
        self._amount_goods_and_services = None
        self._cash_back = None
        self._fees = None
        self._gratuity = None
        self._rebate = None
        self._surcharge = None
        self._value_added_tax = None
        self.discriminator = None
        if amount_goods_and_services is not None:
            self.amount_goods_and_services = amount_goods_and_services
        if cash_back is not None:
            self.cash_back = cash_back
        if fees is not None:
            self.fees = fees
        if gratuity is not None:
            self.gratuity = gratuity
        if rebate is not None:
            self.rebate = rebate
        if surcharge is not None:
            self.surcharge = surcharge
        if value_added_tax is not None:
            self.value_added_tax = value_added_tax

    @property
    def amount_goods_and_services(self):
        """Gets the amount_goods_and_services of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.  # noqa: E501

        Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  # noqa: E501

        :return: The amount_goods_and_services of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.  # noqa: E501
        :rtype: object
        """
        return self._amount_goods_and_services

    @amount_goods_and_services.setter
    def amount_goods_and_services(self, amount_goods_and_services):
        """Sets the amount_goods_and_services of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.

        Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  # noqa: E501

        :param amount_goods_and_services: The amount_goods_and_services of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.  # noqa: E501
        :type: object
        """

        self._amount_goods_and_services = amount_goods_and_services

    @property
    def cash_back(self):
        """Gets the cash_back of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.  # noqa: E501

        Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  # noqa: E501

        :return: The cash_back of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.  # noqa: E501
        :rtype: object
        """
        return self._cash_back

    @cash_back.setter
    def cash_back(self, cash_back):
        """Sets the cash_back of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.

        Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  # noqa: E501

        :param cash_back: The cash_back of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.  # noqa: E501
        :type: object
        """

        self._cash_back = cash_back

    @property
    def fees(self):
        """Gets the fees of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.  # noqa: E501

        Fees amount.  # noqa: E501

        :return: The fees of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.  # noqa: E501
        :rtype: object
        """
        return self._fees

    @fees.setter
    def fees(self, fees):
        """Sets the fees of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.

        Fees amount.  # noqa: E501

        :param fees: The fees of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.  # noqa: E501
        :type: object
        """

        self._fees = fees

    @property
    def gratuity(self):
        """Gets the gratuity of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.  # noqa: E501

        Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  # noqa: E501

        :return: The gratuity of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.  # noqa: E501
        :rtype: object
        """
        return self._gratuity

    @gratuity.setter
    def gratuity(self, gratuity):
        """Sets the gratuity of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.

        Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  # noqa: E501

        :param gratuity: The gratuity of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.  # noqa: E501
        :type: object
        """

        self._gratuity = gratuity

    @property
    def rebate(self):
        """Gets the rebate of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.  # noqa: E501

        Global rebate of the transaction. This amount is counted as a negative amount.  # noqa: E501

        :return: The rebate of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.  # noqa: E501
        :rtype: object
        """
        return self._rebate

    @rebate.setter
    def rebate(self, rebate):
        """Sets the rebate of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.

        Global rebate of the transaction. This amount is counted as a negative amount.  # noqa: E501

        :param rebate: The rebate of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.  # noqa: E501
        :type: object
        """

        self._rebate = rebate

    @property
    def surcharge(self):
        """Gets the surcharge of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.  # noqa: E501

        Additional charge paid by the cardholder. For example airline credit card surcharge.  # noqa: E501

        :return: The surcharge of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.  # noqa: E501
        :rtype: object
        """
        return self._surcharge

    @surcharge.setter
    def surcharge(self, surcharge):
        """Sets the surcharge of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.

        Additional charge paid by the cardholder. For example airline credit card surcharge.  # noqa: E501

        :param surcharge: The surcharge of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.  # noqa: E501
        :type: object
        """

        self._surcharge = surcharge

    @property
    def value_added_tax(self):
        """Gets the value_added_tax of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.  # noqa: E501

        Value added tax amount.  # noqa: E501

        :return: The value_added_tax of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.  # noqa: E501
        :rtype: object
        """
        return self._value_added_tax

    @value_added_tax.setter
    def value_added_tax(self, value_added_tax):
        """Sets the value_added_tax of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.

        Value added tax amount.  # noqa: E501

        :param value_added_tax: The value_added_tax of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.  # noqa: E501
        :type: object
        """

        self._value_added_tax = value_added_tax

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
        if issubclass(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount, dict):
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
        if not isinstance(other, PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
