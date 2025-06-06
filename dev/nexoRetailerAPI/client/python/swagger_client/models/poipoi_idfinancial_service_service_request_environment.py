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

class PoipoiIdfinancialServiceServiceRequestEnvironment(object):
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
        'acquirer': 'PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer',
        'card': 'PoipoiIdfinancialServiceServiceRequestEnvironmentCard',
        'check': 'PoipoiIdfinancialServiceServiceRequestEnvironmentCheck',
        'cardholder': 'PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder',
        'customer_device': 'PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice',
        'loyalty_account': 'object',
        'merchant': 'PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant',
        'merchant_token': 'PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken',
        'poi': 'PoipoiIdfinancialServiceServiceRequestEnvironmentPOI',
        'payment_token': 'PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken',
        'protected_cardholder_data': 'PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData',
        'sale_environment': 'PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment',
        'stored_value_account': 'object',
        'service_provider': 'PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer',
        'wallet': 'PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice'
    }

    attribute_map = {
        'acquirer': 'Acquirer',
        'card': 'Card',
        'check': 'Check',
        'cardholder': 'Cardholder',
        'customer_device': 'CustomerDevice',
        'loyalty_account': 'LoyaltyAccount',
        'merchant': 'Merchant',
        'merchant_token': 'MerchantToken',
        'poi': 'POI',
        'payment_token': 'PaymentToken',
        'protected_cardholder_data': 'ProtectedCardholderData',
        'sale_environment': 'SaleEnvironment',
        'stored_value_account': 'StoredValueAccount',
        'service_provider': 'ServiceProvider',
        'wallet': 'Wallet'
    }

    def __init__(self, acquirer=None, card=None, check=None, cardholder=None, customer_device=None, loyalty_account=None, merchant=None, merchant_token=None, poi=None, payment_token=None, protected_cardholder_data=None, sale_environment=None, stored_value_account=None, service_provider=None, wallet=None):  # noqa: E501
        """PoipoiIdfinancialServiceServiceRequestEnvironment - a model defined in Swagger"""  # noqa: E501
        self._acquirer = None
        self._card = None
        self._check = None
        self._cardholder = None
        self._customer_device = None
        self._loyalty_account = None
        self._merchant = None
        self._merchant_token = None
        self._poi = None
        self._payment_token = None
        self._protected_cardholder_data = None
        self._sale_environment = None
        self._stored_value_account = None
        self._service_provider = None
        self._wallet = None
        self.discriminator = None
        if acquirer is not None:
            self.acquirer = acquirer
        if card is not None:
            self.card = card
        if check is not None:
            self.check = check
        if cardholder is not None:
            self.cardholder = cardholder
        if customer_device is not None:
            self.customer_device = customer_device
        if loyalty_account is not None:
            self.loyalty_account = loyalty_account
        if merchant is not None:
            self.merchant = merchant
        if merchant_token is not None:
            self.merchant_token = merchant_token
        if poi is not None:
            self.poi = poi
        if payment_token is not None:
            self.payment_token = payment_token
        if protected_cardholder_data is not None:
            self.protected_cardholder_data = protected_cardholder_data
        if sale_environment is not None:
            self.sale_environment = sale_environment
        if stored_value_account is not None:
            self.stored_value_account = stored_value_account
        if service_provider is not None:
            self.service_provider = service_provider
        if wallet is not None:
            self.wallet = wallet

    @property
    def acquirer(self):
        """Gets the acquirer of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501


        :return: The acquirer of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :rtype: PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer
        """
        return self._acquirer

    @acquirer.setter
    def acquirer(self, acquirer):
        """Sets the acquirer of this PoipoiIdfinancialServiceServiceRequestEnvironment.


        :param acquirer: The acquirer of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :type: PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer
        """

        self._acquirer = acquirer

    @property
    def card(self):
        """Gets the card of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501


        :return: The card of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :rtype: PoipoiIdfinancialServiceServiceRequestEnvironmentCard
        """
        return self._card

    @card.setter
    def card(self, card):
        """Sets the card of this PoipoiIdfinancialServiceServiceRequestEnvironment.


        :param card: The card of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :type: PoipoiIdfinancialServiceServiceRequestEnvironmentCard
        """

        self._card = card

    @property
    def check(self):
        """Gets the check of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501


        :return: The check of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :rtype: PoipoiIdfinancialServiceServiceRequestEnvironmentCheck
        """
        return self._check

    @check.setter
    def check(self, check):
        """Sets the check of this PoipoiIdfinancialServiceServiceRequestEnvironment.


        :param check: The check of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :type: PoipoiIdfinancialServiceServiceRequestEnvironmentCheck
        """

        self._check = check

    @property
    def cardholder(self):
        """Gets the cardholder of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501


        :return: The cardholder of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :rtype: PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder
        """
        return self._cardholder

    @cardholder.setter
    def cardholder(self, cardholder):
        """Sets the cardholder of this PoipoiIdfinancialServiceServiceRequestEnvironment.


        :param cardholder: The cardholder of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :type: PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder
        """

        self._cardholder = cardholder

    @property
    def customer_device(self):
        """Gets the customer_device of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501


        :return: The customer_device of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :rtype: PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice
        """
        return self._customer_device

    @customer_device.setter
    def customer_device(self, customer_device):
        """Sets the customer_device of this PoipoiIdfinancialServiceServiceRequestEnvironment.


        :param customer_device: The customer_device of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :type: PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice
        """

        self._customer_device = customer_device

    @property
    def loyalty_account(self):
        """Gets the loyalty_account of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501

        Store value account associated to the payment.  # noqa: E501

        :return: The loyalty_account of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :rtype: object
        """
        return self._loyalty_account

    @loyalty_account.setter
    def loyalty_account(self, loyalty_account):
        """Sets the loyalty_account of this PoipoiIdfinancialServiceServiceRequestEnvironment.

        Store value account associated to the payment.  # noqa: E501

        :param loyalty_account: The loyalty_account of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :type: object
        """

        self._loyalty_account = loyalty_account

    @property
    def merchant(self):
        """Gets the merchant of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501


        :return: The merchant of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :rtype: PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant
        """
        return self._merchant

    @merchant.setter
    def merchant(self, merchant):
        """Sets the merchant of this PoipoiIdfinancialServiceServiceRequestEnvironment.


        :param merchant: The merchant of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :type: PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant
        """

        self._merchant = merchant

    @property
    def merchant_token(self):
        """Gets the merchant_token of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501


        :return: The merchant_token of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :rtype: PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken
        """
        return self._merchant_token

    @merchant_token.setter
    def merchant_token(self, merchant_token):
        """Sets the merchant_token of this PoipoiIdfinancialServiceServiceRequestEnvironment.


        :param merchant_token: The merchant_token of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :type: PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken
        """

        self._merchant_token = merchant_token

    @property
    def poi(self):
        """Gets the poi of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501


        :return: The poi of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :rtype: PoipoiIdfinancialServiceServiceRequestEnvironmentPOI
        """
        return self._poi

    @poi.setter
    def poi(self, poi):
        """Sets the poi of this PoipoiIdfinancialServiceServiceRequestEnvironment.


        :param poi: The poi of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :type: PoipoiIdfinancialServiceServiceRequestEnvironmentPOI
        """

        self._poi = poi

    @property
    def payment_token(self):
        """Gets the payment_token of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501


        :return: The payment_token of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :rtype: PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken
        """
        return self._payment_token

    @payment_token.setter
    def payment_token(self, payment_token):
        """Sets the payment_token of this PoipoiIdfinancialServiceServiceRequestEnvironment.


        :param payment_token: The payment_token of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :type: PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken
        """

        self._payment_token = payment_token

    @property
    def protected_cardholder_data(self):
        """Gets the protected_cardholder_data of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501


        :return: The protected_cardholder_data of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :rtype: PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData
        """
        return self._protected_cardholder_data

    @protected_cardholder_data.setter
    def protected_cardholder_data(self, protected_cardholder_data):
        """Sets the protected_cardholder_data of this PoipoiIdfinancialServiceServiceRequestEnvironment.


        :param protected_cardholder_data: The protected_cardholder_data of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :type: PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData
        """

        self._protected_cardholder_data = protected_cardholder_data

    @property
    def sale_environment(self):
        """Gets the sale_environment of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501


        :return: The sale_environment of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :rtype: PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment
        """
        return self._sale_environment

    @sale_environment.setter
    def sale_environment(self, sale_environment):
        """Sets the sale_environment of this PoipoiIdfinancialServiceServiceRequestEnvironment.


        :param sale_environment: The sale_environment of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :type: PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment
        """

        self._sale_environment = sale_environment

    @property
    def stored_value_account(self):
        """Gets the stored_value_account of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501

        Store value account payment instrument.  # noqa: E501

        :return: The stored_value_account of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :rtype: object
        """
        return self._stored_value_account

    @stored_value_account.setter
    def stored_value_account(self, stored_value_account):
        """Sets the stored_value_account of this PoipoiIdfinancialServiceServiceRequestEnvironment.

        Store value account payment instrument.  # noqa: E501

        :param stored_value_account: The stored_value_account of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :type: object
        """

        self._stored_value_account = stored_value_account

    @property
    def service_provider(self):
        """Gets the service_provider of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501


        :return: The service_provider of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :rtype: PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer
        """
        return self._service_provider

    @service_provider.setter
    def service_provider(self, service_provider):
        """Sets the service_provider of this PoipoiIdfinancialServiceServiceRequestEnvironment.


        :param service_provider: The service_provider of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :type: PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer
        """

        self._service_provider = service_provider

    @property
    def wallet(self):
        """Gets the wallet of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501


        :return: The wallet of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :rtype: PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice
        """
        return self._wallet

    @wallet.setter
    def wallet(self, wallet):
        """Sets the wallet of this PoipoiIdfinancialServiceServiceRequestEnvironment.


        :param wallet: The wallet of this PoipoiIdfinancialServiceServiceRequestEnvironment.  # noqa: E501
        :type: PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice
        """

        self._wallet = wallet

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
        if issubclass(PoipoiIdfinancialServiceServiceRequestEnvironment, dict):
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
        if not isinstance(other, PoipoiIdfinancialServiceServiceRequestEnvironment):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
