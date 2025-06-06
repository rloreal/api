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

class PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest(object):
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
        'account_reference': 'object',
        'account_type': 'object',
        'customer_order': 'PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder'
    }

    attribute_map = {
        'account_reference': 'AccountReference',
        'account_type': 'AccountType',
        'customer_order': 'CustomerOrder'
    }

    def __init__(self, account_reference=None, account_type=None, customer_order=None):  # noqa: E501
        """PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest - a model defined in Swagger"""  # noqa: E501
        self._account_reference = None
        self._account_type = None
        self._customer_order = None
        self.discriminator = None
        if account_reference is not None:
            self.account_reference = account_reference
        if account_type is not None:
            self.account_type = account_type
        if customer_order is not None:
            self.customer_order = customer_order

    @property
    def account_reference(self):
        """Gets the account_reference of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The account_reference of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest.  # noqa: E501
        :rtype: object
        """
        return self._account_reference

    @account_reference.setter
    def account_reference(self, account_reference):
        """Sets the account_reference of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param account_reference: The account_reference of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest.  # noqa: E501
        :type: object
        """

        self._account_reference = account_reference

    @property
    def account_type(self):
        """Gets the account_type of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest.  # noqa: E501

        Type of cardholder account used for the transaction.<br/>- **CTDP: CertificateOfDeposit**  : *Certificate of deposit saving account.*<br/>- **CHCK: Checking**  : *Checking account.*<br/>- **CRDT: CreditCard**  : *Credit card account.*<br/>- **CURR: Current**  : *Current account.*<br/>- **CDBT: DebitCard**  : *Debit card account.*<br/>- **DFLT: Default**  : *Default account.*<br/>- **EPRS: EpurseCard**  : *Electronic purse card account.*<br/>- **HEQL: HomeEquityLoan**  : *Home equity loan credit account.*<br/>- **ISTL: InstalmentLoan**  : *Instalment loan credit account.*<br/>- **INVS: Investment**  : *Investment account.*<br/>- **LCDT: LineOfCredit**  : *Line of credit account.*<br/>- **MBNW: MobilePhoneAccount**  : *Mobile Station Integrated Services Digital Network Number (MSISDN).*<br/>- **MNMK: MoneyMarket**  : *Money market saving account.*<br/>- **MNMC: MoneyMarketChecking**  : *Money market checking account.*<br/>- **MTGL: MortgageLoan**  : *Mortgage loan credit account.*<br/>- **RTRM: RetirementAccount**  : *Retirement account.*<br/>- **RVLV: RevolvingLoanAccount**  : *Revolving loan account.*<br/>- **SVNG: Savings**  : *Savings account.*<br/>- **STBD: StockOrBond**  : *Stock or bond investment account.*<br/>- **UVRL: Universal**  : *Universal account.*<br/>- **PRPD: PrePaid**  : *Pre-paid account.*<br/>- **FLTC: FleetCard**  : *Fleet card account.*<br/>  # noqa: E501

        :return: The account_type of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest.  # noqa: E501
        :rtype: object
        """
        return self._account_type

    @account_type.setter
    def account_type(self, account_type):
        """Sets the account_type of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest.

        Type of cardholder account used for the transaction.<br/>- **CTDP: CertificateOfDeposit**  : *Certificate of deposit saving account.*<br/>- **CHCK: Checking**  : *Checking account.*<br/>- **CRDT: CreditCard**  : *Credit card account.*<br/>- **CURR: Current**  : *Current account.*<br/>- **CDBT: DebitCard**  : *Debit card account.*<br/>- **DFLT: Default**  : *Default account.*<br/>- **EPRS: EpurseCard**  : *Electronic purse card account.*<br/>- **HEQL: HomeEquityLoan**  : *Home equity loan credit account.*<br/>- **ISTL: InstalmentLoan**  : *Instalment loan credit account.*<br/>- **INVS: Investment**  : *Investment account.*<br/>- **LCDT: LineOfCredit**  : *Line of credit account.*<br/>- **MBNW: MobilePhoneAccount**  : *Mobile Station Integrated Services Digital Network Number (MSISDN).*<br/>- **MNMK: MoneyMarket**  : *Money market saving account.*<br/>- **MNMC: MoneyMarketChecking**  : *Money market checking account.*<br/>- **MTGL: MortgageLoan**  : *Mortgage loan credit account.*<br/>- **RTRM: RetirementAccount**  : *Retirement account.*<br/>- **RVLV: RevolvingLoanAccount**  : *Revolving loan account.*<br/>- **SVNG: Savings**  : *Savings account.*<br/>- **STBD: StockOrBond**  : *Stock or bond investment account.*<br/>- **UVRL: Universal**  : *Universal account.*<br/>- **PRPD: PrePaid**  : *Pre-paid account.*<br/>- **FLTC: FleetCard**  : *Fleet card account.*<br/>  # noqa: E501

        :param account_type: The account_type of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest.  # noqa: E501
        :type: object
        """

        self._account_type = account_type

    @property
    def customer_order(self):
        """Gets the customer_order of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest.  # noqa: E501


        :return: The customer_order of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest.  # noqa: E501
        :rtype: PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder
        """
        return self._customer_order

    @customer_order.setter
    def customer_order(self, customer_order):
        """Sets the customer_order of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest.


        :param customer_order: The customer_order of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest.  # noqa: E501
        :type: PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder
        """

        self._customer_order = customer_order

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
        if issubclass(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest, dict):
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
        if not isinstance(other, PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
