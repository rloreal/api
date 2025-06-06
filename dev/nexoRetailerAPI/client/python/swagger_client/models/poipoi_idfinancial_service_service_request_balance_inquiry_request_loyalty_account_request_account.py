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

class PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount(object):
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
        'balance': 'object',
        'brand': 'object',
        'currency': 'object',
        'identification_type': 'object',
        'loyalty_identification': 'object',
        'entry_mode': 'object',
        'owner_name': 'object',
        'provider': 'object',
        'unit': 'object'
    }

    attribute_map = {
        'balance': 'Balance',
        'brand': 'Brand',
        'currency': 'Currency',
        'identification_type': 'IdentificationType',
        'loyalty_identification': 'LoyaltyIdentification',
        'entry_mode': 'EntryMode',
        'owner_name': 'OwnerName',
        'provider': 'Provider',
        'unit': 'Unit'
    }

    def __init__(self, balance=None, brand=None, currency=None, identification_type=None, loyalty_identification=None, entry_mode=None, owner_name=None, provider=None, unit=None):  # noqa: E501
        """PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount - a model defined in Swagger"""  # noqa: E501
        self._balance = None
        self._brand = None
        self._currency = None
        self._identification_type = None
        self._loyalty_identification = None
        self._entry_mode = None
        self._owner_name = None
        self._provider = None
        self._unit = None
        self.discriminator = None
        if balance is not None:
            self.balance = balance
        if brand is not None:
            self.brand = brand
        if currency is not None:
            self.currency = currency
        if identification_type is not None:
            self.identification_type = identification_type
        self.loyalty_identification = loyalty_identification
        if entry_mode is not None:
            self.entry_mode = entry_mode
        if owner_name is not None:
            self.owner_name = owner_name
        if provider is not None:
            self.provider = provider
        if unit is not None:
            self.unit = unit

    @property
    def balance(self):
        """Gets the balance of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501

        Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  # noqa: E501

        :return: The balance of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501
        :rtype: object
        """
        return self._balance

    @balance.setter
    def balance(self, balance):
        """Sets the balance of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.

        Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  # noqa: E501

        :param balance: The balance of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501
        :type: object
        """

        self._balance = balance

    @property
    def brand(self):
        """Gets the brand of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The brand of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501
        :rtype: object
        """
        return self._brand

    @brand.setter
    def brand(self, brand):
        """Sets the brand of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param brand: The brand of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501
        :type: object
        """

        self._brand = brand

    @property
    def currency(self):
        """Gets the currency of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501

        A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>  # noqa: E501

        :return: The currency of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501
        :rtype: object
        """
        return self._currency

    @currency.setter
    def currency(self, currency):
        """Sets the currency of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.

        A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>  # noqa: E501

        :param currency: The currency of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501
        :type: object
        """

        self._currency = currency

    @property
    def identification_type(self):
        """Gets the identification_type of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501

        Type of account identification.<br/>- **ACCT: AccountNumber**  : *Account identification.*<br/>- **BARC: BarCode**  : *Bar-code with a specific form of identification.*<br/>- **ISO2: ISOTrack2**  : *ISO Track 2 including identification.*<br/>- **PHON: PhoneNumber**  : *A phone number identifies the account on which the phone card is assigned.*<br/>- **CPAN: PrimaryAccountNumber**  : *Standard card identification (card number).*<br/>- **PRIV: PrivativeNumbering**  : *An identification set by a privative application.*<br/>- **UUID: UniversalUniqueIdentification**  : *A Universal Unique Identification code is set for identification.*<br/>  # noqa: E501

        :return: The identification_type of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501
        :rtype: object
        """
        return self._identification_type

    @identification_type.setter
    def identification_type(self, identification_type):
        """Sets the identification_type of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.

        Type of account identification.<br/>- **ACCT: AccountNumber**  : *Account identification.*<br/>- **BARC: BarCode**  : *Bar-code with a specific form of identification.*<br/>- **ISO2: ISOTrack2**  : *ISO Track 2 including identification.*<br/>- **PHON: PhoneNumber**  : *A phone number identifies the account on which the phone card is assigned.*<br/>- **CPAN: PrimaryAccountNumber**  : *Standard card identification (card number).*<br/>- **PRIV: PrivativeNumbering**  : *An identification set by a privative application.*<br/>- **UUID: UniversalUniqueIdentification**  : *A Universal Unique Identification code is set for identification.*<br/>  # noqa: E501

        :param identification_type: The identification_type of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501
        :type: object
        """

        self._identification_type = identification_type

    @property
    def loyalty_identification(self):
        """Gets the loyalty_identification of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The loyalty_identification of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501
        :rtype: object
        """
        return self._loyalty_identification

    @loyalty_identification.setter
    def loyalty_identification(self, loyalty_identification):
        """Sets the loyalty_identification of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param loyalty_identification: The loyalty_identification of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501
        :type: object
        """
        if loyalty_identification is None:
            raise ValueError("Invalid value for `loyalty_identification`, must not be `None`")  # noqa: E501

        self._loyalty_identification = loyalty_identification

    @property
    def entry_mode(self):
        """Gets the entry_mode of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501

        Type of reading of the card data.<br/>- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*<br/>- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*<br/>- **BRCD: BarCode**  : *Bar code.*<br/>- **MGST: MagneticStripe**  : *Magnetic stripe.*<br/>- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*<br/>- **DFLE: AccountData**  : *Account data on file.*<br/>- **CTLS: ProximityReader**  : *Contactless proximity reader.*<br/>- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*<br/>- **CDFL: CardOnFile**  : *Card information are stored on a file.*<br/>- **SICC: SynchronousIntegratedCircuitCard**  : *Synchronous ICC - (Integrated Circuit Card) with contact.*<br/>- **UNKW: Unknown**  : *Unknown card reading capability.*<br/>- **QRCD: QRCode**  : *Quick response code.*<br/>- **OPTC: OpticalCode**  : *Optical coded reading capabilities (e.g. barcode, QR code, etc.)*<br/>  # noqa: E501

        :return: The entry_mode of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501
        :rtype: object
        """
        return self._entry_mode

    @entry_mode.setter
    def entry_mode(self, entry_mode):
        """Sets the entry_mode of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.

        Type of reading of the card data.<br/>- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*<br/>- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*<br/>- **BRCD: BarCode**  : *Bar code.*<br/>- **MGST: MagneticStripe**  : *Magnetic stripe.*<br/>- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*<br/>- **DFLE: AccountData**  : *Account data on file.*<br/>- **CTLS: ProximityReader**  : *Contactless proximity reader.*<br/>- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*<br/>- **CDFL: CardOnFile**  : *Card information are stored on a file.*<br/>- **SICC: SynchronousIntegratedCircuitCard**  : *Synchronous ICC - (Integrated Circuit Card) with contact.*<br/>- **UNKW: Unknown**  : *Unknown card reading capability.*<br/>- **QRCD: QRCode**  : *Quick response code.*<br/>- **OPTC: OpticalCode**  : *Optical coded reading capabilities (e.g. barcode, QR code, etc.)*<br/>  # noqa: E501

        :param entry_mode: The entry_mode of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501
        :type: object
        """

        self._entry_mode = entry_mode

    @property
    def owner_name(self):
        """Gets the owner_name of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501

        Specifies a character string with a maximum length of 45 characters.<br/>  # noqa: E501

        :return: The owner_name of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501
        :rtype: object
        """
        return self._owner_name

    @owner_name.setter
    def owner_name(self, owner_name):
        """Sets the owner_name of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.

        Specifies a character string with a maximum length of 45 characters.<br/>  # noqa: E501

        :param owner_name: The owner_name of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501
        :type: object
        """

        self._owner_name = owner_name

    @property
    def provider(self):
        """Gets the provider of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The provider of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501
        :rtype: object
        """
        return self._provider

    @provider.setter
    def provider(self, provider):
        """Sets the provider of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param provider: The provider of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501
        :type: object
        """

        self._provider = provider

    @property
    def unit(self):
        """Gets the unit of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501

        Unit of a amount (for loyalty or account).<br/>- **MONE: Monetary**  : *The amount is expressed in a monetary value in a currency.*<br/>- **POIN: Point**  : *The amount is expressed in point.*<br/>  # noqa: E501

        :return: The unit of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501
        :rtype: object
        """
        return self._unit

    @unit.setter
    def unit(self, unit):
        """Sets the unit of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.

        Unit of a amount (for loyalty or account).<br/>- **MONE: Monetary**  : *The amount is expressed in a monetary value in a currency.*<br/>- **POIN: Point**  : *The amount is expressed in point.*<br/>  # noqa: E501

        :param unit: The unit of this PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.  # noqa: E501
        :type: object
        """

        self._unit = unit

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
        if issubclass(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount, dict):
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
        if not isinstance(other, PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
