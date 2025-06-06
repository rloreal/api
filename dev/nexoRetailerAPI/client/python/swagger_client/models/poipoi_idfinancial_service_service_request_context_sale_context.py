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

class PoipoiIdfinancialServiceServiceRequestContextSaleContext(object):
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
        'additional_sale_data': 'object',
        'allowed_entry_mode': 'object',
        'cashier_identification': 'object',
        'cashier_language': 'object',
        'customer_order_request_flag': 'object',
        'delivery_note_number': 'object',
        'force_online_flag': 'object',
        'invoice_number': 'object',
        'purchase_order_number': 'object',
        'reuse_card_data_flag': 'object',
        'remaining_amount': 'object',
        'sale_identification': 'object',
        'sale_reconciliation_identification': 'object',
        'sale_reference_number': 'object',
        'sale_token_scope': 'object',
        'shift_number': 'object',
        'split_payment': 'object',
        'sponsored_merchant': 'object'
    }

    attribute_map = {
        'additional_sale_data': 'AdditionalSaleData',
        'allowed_entry_mode': 'AllowedEntryMode',
        'cashier_identification': 'CashierIdentification',
        'cashier_language': 'CashierLanguage',
        'customer_order_request_flag': 'CustomerOrderRequestFlag',
        'delivery_note_number': 'DeliveryNoteNumber',
        'force_online_flag': 'ForceOnlineFlag',
        'invoice_number': 'InvoiceNumber',
        'purchase_order_number': 'PurchaseOrderNumber',
        'reuse_card_data_flag': 'ReuseCardDataFlag',
        'remaining_amount': 'RemainingAmount',
        'sale_identification': 'SaleIdentification',
        'sale_reconciliation_identification': 'SaleReconciliationIdentification',
        'sale_reference_number': 'SaleReferenceNumber',
        'sale_token_scope': 'SaleTokenScope',
        'shift_number': 'ShiftNumber',
        'split_payment': 'SplitPayment',
        'sponsored_merchant': 'SponsoredMerchant'
    }

    def __init__(self, additional_sale_data=None, allowed_entry_mode=None, cashier_identification=None, cashier_language=None, customer_order_request_flag=None, delivery_note_number=None, force_online_flag=None, invoice_number=None, purchase_order_number=None, reuse_card_data_flag=None, remaining_amount=None, sale_identification=None, sale_reconciliation_identification=None, sale_reference_number=None, sale_token_scope=None, shift_number=None, split_payment=None, sponsored_merchant=None):  # noqa: E501
        """PoipoiIdfinancialServiceServiceRequestContextSaleContext - a model defined in Swagger"""  # noqa: E501
        self._additional_sale_data = None
        self._allowed_entry_mode = None
        self._cashier_identification = None
        self._cashier_language = None
        self._customer_order_request_flag = None
        self._delivery_note_number = None
        self._force_online_flag = None
        self._invoice_number = None
        self._purchase_order_number = None
        self._reuse_card_data_flag = None
        self._remaining_amount = None
        self._sale_identification = None
        self._sale_reconciliation_identification = None
        self._sale_reference_number = None
        self._sale_token_scope = None
        self._shift_number = None
        self._split_payment = None
        self._sponsored_merchant = None
        self.discriminator = None
        if additional_sale_data is not None:
            self.additional_sale_data = additional_sale_data
        if allowed_entry_mode is not None:
            self.allowed_entry_mode = allowed_entry_mode
        if cashier_identification is not None:
            self.cashier_identification = cashier_identification
        if cashier_language is not None:
            self.cashier_language = cashier_language
        if customer_order_request_flag is not None:
            self.customer_order_request_flag = customer_order_request_flag
        if delivery_note_number is not None:
            self.delivery_note_number = delivery_note_number
        if force_online_flag is not None:
            self.force_online_flag = force_online_flag
        if invoice_number is not None:
            self.invoice_number = invoice_number
        if purchase_order_number is not None:
            self.purchase_order_number = purchase_order_number
        if reuse_card_data_flag is not None:
            self.reuse_card_data_flag = reuse_card_data_flag
        if remaining_amount is not None:
            self.remaining_amount = remaining_amount
        if sale_identification is not None:
            self.sale_identification = sale_identification
        if sale_reconciliation_identification is not None:
            self.sale_reconciliation_identification = sale_reconciliation_identification
        if sale_reference_number is not None:
            self.sale_reference_number = sale_reference_number
        if sale_token_scope is not None:
            self.sale_token_scope = sale_token_scope
        if shift_number is not None:
            self.shift_number = shift_number
        if split_payment is not None:
            self.split_payment = split_payment
        if sponsored_merchant is not None:
            self.sponsored_merchant = sponsored_merchant

    @property
    def additional_sale_data(self):
        """Gets the additional_sale_data of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501

        Specifies a character string with a maximum length of 70characters.<br/>  # noqa: E501

        :return: The additional_sale_data of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :rtype: object
        """
        return self._additional_sale_data

    @additional_sale_data.setter
    def additional_sale_data(self, additional_sale_data):
        """Sets the additional_sale_data of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.

        Specifies a character string with a maximum length of 70characters.<br/>  # noqa: E501

        :param additional_sale_data: The additional_sale_data of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :type: object
        """

        self._additional_sale_data = additional_sale_data

    @property
    def allowed_entry_mode(self):
        """Gets the allowed_entry_mode of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501

        Type of card data reading.  # noqa: E501

        :return: The allowed_entry_mode of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :rtype: object
        """
        return self._allowed_entry_mode

    @allowed_entry_mode.setter
    def allowed_entry_mode(self, allowed_entry_mode):
        """Sets the allowed_entry_mode of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.

        Type of card data reading.  # noqa: E501

        :param allowed_entry_mode: The allowed_entry_mode of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :type: object
        """

        self._allowed_entry_mode = allowed_entry_mode

    @property
    def cashier_identification(self):
        """Gets the cashier_identification of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The cashier_identification of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :rtype: object
        """
        return self._cashier_identification

    @cashier_identification.setter
    def cashier_identification(self, cashier_identification):
        """Sets the cashier_identification of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param cashier_identification: The cashier_identification of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :type: object
        """

        self._cashier_identification = cashier_identification

    @property
    def cashier_language(self):
        """Gets the cashier_language of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501

        Languages used by the cashier.  # noqa: E501

        :return: The cashier_language of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :rtype: object
        """
        return self._cashier_language

    @cashier_language.setter
    def cashier_language(self, cashier_language):
        """Sets the cashier_language of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.

        Languages used by the cashier.  # noqa: E501

        :param cashier_language: The cashier_language of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :type: object
        """

        self._cashier_language = cashier_language

    @property
    def customer_order_request_flag(self):
        """Gets the customer_order_request_flag of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501

        A flag indicating a True or False value.<br/>  # noqa: E501

        :return: The customer_order_request_flag of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :rtype: object
        """
        return self._customer_order_request_flag

    @customer_order_request_flag.setter
    def customer_order_request_flag(self, customer_order_request_flag):
        """Sets the customer_order_request_flag of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.

        A flag indicating a True or False value.<br/>  # noqa: E501

        :param customer_order_request_flag: The customer_order_request_flag of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :type: object
        """

        self._customer_order_request_flag = customer_order_request_flag

    @property
    def delivery_note_number(self):
        """Gets the delivery_note_number of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The delivery_note_number of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :rtype: object
        """
        return self._delivery_note_number

    @delivery_note_number.setter
    def delivery_note_number(self, delivery_note_number):
        """Sets the delivery_note_number of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param delivery_note_number: The delivery_note_number of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :type: object
        """

        self._delivery_note_number = delivery_note_number

    @property
    def force_online_flag(self):
        """Gets the force_online_flag of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501

        A flag indicating a True or False value.<br/>  # noqa: E501

        :return: The force_online_flag of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :rtype: object
        """
        return self._force_online_flag

    @force_online_flag.setter
    def force_online_flag(self, force_online_flag):
        """Sets the force_online_flag of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.

        A flag indicating a True or False value.<br/>  # noqa: E501

        :param force_online_flag: The force_online_flag of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :type: object
        """

        self._force_online_flag = force_online_flag

    @property
    def invoice_number(self):
        """Gets the invoice_number of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The invoice_number of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :rtype: object
        """
        return self._invoice_number

    @invoice_number.setter
    def invoice_number(self, invoice_number):
        """Sets the invoice_number of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param invoice_number: The invoice_number of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :type: object
        """

        self._invoice_number = invoice_number

    @property
    def purchase_order_number(self):
        """Gets the purchase_order_number of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The purchase_order_number of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :rtype: object
        """
        return self._purchase_order_number

    @purchase_order_number.setter
    def purchase_order_number(self, purchase_order_number):
        """Sets the purchase_order_number of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param purchase_order_number: The purchase_order_number of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :type: object
        """

        self._purchase_order_number = purchase_order_number

    @property
    def reuse_card_data_flag(self):
        """Gets the reuse_card_data_flag of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501

        A flag indicating a True or False value.<br/>  # noqa: E501

        :return: The reuse_card_data_flag of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :rtype: object
        """
        return self._reuse_card_data_flag

    @reuse_card_data_flag.setter
    def reuse_card_data_flag(self, reuse_card_data_flag):
        """Sets the reuse_card_data_flag of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.

        A flag indicating a True or False value.<br/>  # noqa: E501

        :param reuse_card_data_flag: The reuse_card_data_flag of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :type: object
        """

        self._reuse_card_data_flag = reuse_card_data_flag

    @property
    def remaining_amount(self):
        """Gets the remaining_amount of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501

        Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  # noqa: E501

        :return: The remaining_amount of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :rtype: object
        """
        return self._remaining_amount

    @remaining_amount.setter
    def remaining_amount(self, remaining_amount):
        """Sets the remaining_amount of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.

        Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  # noqa: E501

        :param remaining_amount: The remaining_amount of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :type: object
        """

        self._remaining_amount = remaining_amount

    @property
    def sale_identification(self):
        """Gets the sale_identification of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The sale_identification of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :rtype: object
        """
        return self._sale_identification

    @sale_identification.setter
    def sale_identification(self, sale_identification):
        """Sets the sale_identification of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param sale_identification: The sale_identification of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :type: object
        """

        self._sale_identification = sale_identification

    @property
    def sale_reconciliation_identification(self):
        """Gets the sale_reconciliation_identification of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The sale_reconciliation_identification of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :rtype: object
        """
        return self._sale_reconciliation_identification

    @sale_reconciliation_identification.setter
    def sale_reconciliation_identification(self, sale_reconciliation_identification):
        """Sets the sale_reconciliation_identification of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param sale_reconciliation_identification: The sale_reconciliation_identification of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :type: object
        """

        self._sale_reconciliation_identification = sale_reconciliation_identification

    @property
    def sale_reference_number(self):
        """Gets the sale_reference_number of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The sale_reference_number of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :rtype: object
        """
        return self._sale_reference_number

    @sale_reference_number.setter
    def sale_reference_number(self, sale_reference_number):
        """Sets the sale_reference_number of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param sale_reference_number: The sale_reference_number of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :type: object
        """

        self._sale_reference_number = sale_reference_number

    @property
    def sale_token_scope(self):
        """Gets the sale_token_scope of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501

        Scope of the token that identifies the payment mean of the customer.<br/>- **MULT: MultipleUse**  : *The token is generated to recognise a customer for a longer period.*<br/>- **SNGL: SingleUse**  : *The token is generated to recognise  a customer during the lifetime of a transaction.*<br/>  # noqa: E501

        :return: The sale_token_scope of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :rtype: object
        """
        return self._sale_token_scope

    @sale_token_scope.setter
    def sale_token_scope(self, sale_token_scope):
        """Sets the sale_token_scope of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.

        Scope of the token that identifies the payment mean of the customer.<br/>- **MULT: MultipleUse**  : *The token is generated to recognise a customer for a longer period.*<br/>- **SNGL: SingleUse**  : *The token is generated to recognise  a customer during the lifetime of a transaction.*<br/>  # noqa: E501

        :param sale_token_scope: The sale_token_scope of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :type: object
        """

        self._sale_token_scope = sale_token_scope

    @property
    def shift_number(self):
        """Gets the shift_number of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501

        Specifies a numeric string with a maximum length of 2 digits.<br/>  # noqa: E501

        :return: The shift_number of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :rtype: object
        """
        return self._shift_number

    @shift_number.setter
    def shift_number(self, shift_number):
        """Sets the shift_number of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.

        Specifies a numeric string with a maximum length of 2 digits.<br/>  # noqa: E501

        :param shift_number: The shift_number of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :type: object
        """

        self._shift_number = shift_number

    @property
    def split_payment(self):
        """Gets the split_payment of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501

        A flag indicating a True or False value.<br/>  # noqa: E501

        :return: The split_payment of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :rtype: object
        """
        return self._split_payment

    @split_payment.setter
    def split_payment(self, split_payment):
        """Sets the split_payment of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.

        A flag indicating a True or False value.<br/>  # noqa: E501

        :param split_payment: The split_payment of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :type: object
        """

        self._split_payment = split_payment

    @property
    def sponsored_merchant(self):
        """Gets the sponsored_merchant of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501

        Merchant using the payment services of a payment facilitator, acting as a card acceptor.  # noqa: E501

        :return: The sponsored_merchant of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :rtype: object
        """
        return self._sponsored_merchant

    @sponsored_merchant.setter
    def sponsored_merchant(self, sponsored_merchant):
        """Sets the sponsored_merchant of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.

        Merchant using the payment services of a payment facilitator, acting as a card acceptor.  # noqa: E501

        :param sponsored_merchant: The sponsored_merchant of this PoipoiIdfinancialServiceServiceRequestContextSaleContext.  # noqa: E501
        :type: object
        """

        self._sponsored_merchant = sponsored_merchant

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
        if issubclass(PoipoiIdfinancialServiceServiceRequestContextSaleContext, dict):
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
        if not isinstance(other, PoipoiIdfinancialServiceServiceRequestContextSaleContext):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
