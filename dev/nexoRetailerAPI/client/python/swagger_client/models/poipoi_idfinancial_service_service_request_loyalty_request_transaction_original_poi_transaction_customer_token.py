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

class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken(object):
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
        'card_sequence_number': 'object',
        'token': 'object',
        'token_assurance_data': 'object',
        'token_assurance_level': 'object',
        'token_assurance_method': 'object',
        'token_characteristic': 'object',
        'token_initiated_indicator': 'object',
        'token_requestor': 'PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor',
        'token_expiry_date': 'object'
    }

    attribute_map = {
        'card_sequence_number': 'CardSequenceNumber',
        'token': 'Token',
        'token_assurance_data': 'TokenAssuranceData',
        'token_assurance_level': 'TokenAssuranceLevel',
        'token_assurance_method': 'TokenAssuranceMethod',
        'token_characteristic': 'TokenCharacteristic',
        'token_initiated_indicator': 'TokenInitiatedIndicator',
        'token_requestor': 'TokenRequestor',
        'token_expiry_date': 'TokenExpiryDate'
    }

    def __init__(self, card_sequence_number=None, token=None, token_assurance_data=None, token_assurance_level=None, token_assurance_method=None, token_characteristic=None, token_initiated_indicator=None, token_requestor=None, token_expiry_date=None):  # noqa: E501
        """PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken - a model defined in Swagger"""  # noqa: E501
        self._card_sequence_number = None
        self._token = None
        self._token_assurance_data = None
        self._token_assurance_level = None
        self._token_assurance_method = None
        self._token_characteristic = None
        self._token_initiated_indicator = None
        self._token_requestor = None
        self._token_expiry_date = None
        self.discriminator = None
        if card_sequence_number is not None:
            self.card_sequence_number = card_sequence_number
        if token is not None:
            self.token = token
        if token_assurance_data is not None:
            self.token_assurance_data = token_assurance_data
        if token_assurance_level is not None:
            self.token_assurance_level = token_assurance_level
        if token_assurance_method is not None:
            self.token_assurance_method = token_assurance_method
        if token_characteristic is not None:
            self.token_characteristic = token_characteristic
        if token_initiated_indicator is not None:
            self.token_initiated_indicator = token_initiated_indicator
        if token_requestor is not None:
            self.token_requestor = token_requestor
        if token_expiry_date is not None:
            self.token_expiry_date = token_expiry_date

    @property
    def card_sequence_number(self):
        """Gets the card_sequence_number of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501

        Specifies a numeric string with a minimum length of 2 digits, and a maximum length of 3 digits.<br/>  # noqa: E501

        :return: The card_sequence_number of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501
        :rtype: object
        """
        return self._card_sequence_number

    @card_sequence_number.setter
    def card_sequence_number(self, card_sequence_number):
        """Sets the card_sequence_number of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.

        Specifies a numeric string with a minimum length of 2 digits, and a maximum length of 3 digits.<br/>  # noqa: E501

        :param card_sequence_number: The card_sequence_number of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501
        :type: object
        """

        self._card_sequence_number = card_sequence_number

    @property
    def token(self):
        """Gets the token of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501

        Specifies a numeric string with a minimum length of 8 digits, and a maximum length of 28 digits.<br/>  # noqa: E501

        :return: The token of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501
        :rtype: object
        """
        return self._token

    @token.setter
    def token(self, token):
        """Sets the token of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.

        Specifies a numeric string with a minimum length of 8 digits, and a maximum length of 28 digits.<br/>  # noqa: E501

        :param token: The token of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501
        :type: object
        """

        self._token = token

    @property
    def token_assurance_data(self):
        """Gets the token_assurance_data of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501

        Specifies a binary string with a maximum length of 500 binary bytes.<br/>  # noqa: E501

        :return: The token_assurance_data of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501
        :rtype: object
        """
        return self._token_assurance_data

    @token_assurance_data.setter
    def token_assurance_data(self, token_assurance_data):
        """Sets the token_assurance_data of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.

        Specifies a binary string with a maximum length of 500 binary bytes.<br/>  # noqa: E501

        :param token_assurance_data: The token_assurance_data of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501
        :type: object
        """

        self._token_assurance_data = token_assurance_data

    @property
    def token_assurance_level(self):
        """Gets the token_assurance_level of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501

        Number of objects represented as an integer.<br/>  # noqa: E501

        :return: The token_assurance_level of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501
        :rtype: object
        """
        return self._token_assurance_level

    @token_assurance_level.setter
    def token_assurance_level(self, token_assurance_level):
        """Sets the token_assurance_level of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.

        Number of objects represented as an integer.<br/>  # noqa: E501

        :param token_assurance_level: The token_assurance_level of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501
        :type: object
        """

        self._token_assurance_level = token_assurance_level

    @property
    def token_assurance_method(self):
        """Gets the token_assurance_method of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501

        Specifies a numeric string with a maximum length of 2 digits.<br/>  # noqa: E501

        :return: The token_assurance_method of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501
        :rtype: object
        """
        return self._token_assurance_method

    @token_assurance_method.setter
    def token_assurance_method(self, token_assurance_method):
        """Sets the token_assurance_method of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.

        Specifies a numeric string with a maximum length of 2 digits.<br/>  # noqa: E501

        :param token_assurance_method: The token_assurance_method of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501
        :type: object
        """

        self._token_assurance_method = token_assurance_method

    @property
    def token_characteristic(self):
        """Gets the token_characteristic of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501

        Additional payment token information.  # noqa: E501

        :return: The token_characteristic of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501
        :rtype: object
        """
        return self._token_characteristic

    @token_characteristic.setter
    def token_characteristic(self, token_characteristic):
        """Sets the token_characteristic of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.

        Additional payment token information.  # noqa: E501

        :param token_characteristic: The token_characteristic of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501
        :type: object
        """

        self._token_characteristic = token_characteristic

    @property
    def token_initiated_indicator(self):
        """Gets the token_initiated_indicator of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501

        A flag indicating a True or False value.<br/>  # noqa: E501

        :return: The token_initiated_indicator of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501
        :rtype: object
        """
        return self._token_initiated_indicator

    @token_initiated_indicator.setter
    def token_initiated_indicator(self, token_initiated_indicator):
        """Sets the token_initiated_indicator of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.

        A flag indicating a True or False value.<br/>  # noqa: E501

        :param token_initiated_indicator: The token_initiated_indicator of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501
        :type: object
        """

        self._token_initiated_indicator = token_initiated_indicator

    @property
    def token_requestor(self):
        """Gets the token_requestor of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501


        :return: The token_requestor of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501
        :rtype: PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor
        """
        return self._token_requestor

    @token_requestor.setter
    def token_requestor(self, token_requestor):
        """Sets the token_requestor of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.


        :param token_requestor: The token_requestor of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501
        :type: PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor
        """

        self._token_requestor = token_requestor

    @property
    def token_expiry_date(self):
        """Gets the token_expiry_date of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501

        Specifies a character string with a maximum length of 10 characters.<br/>  # noqa: E501

        :return: The token_expiry_date of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501
        :rtype: object
        """
        return self._token_expiry_date

    @token_expiry_date.setter
    def token_expiry_date(self, token_expiry_date):
        """Sets the token_expiry_date of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.

        Specifies a character string with a maximum length of 10 characters.<br/>  # noqa: E501

        :param token_expiry_date: The token_expiry_date of this PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.  # noqa: E501
        :type: object
        """

        self._token_expiry_date = token_expiry_date

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
        if issubclass(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken, dict):
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
        if not isinstance(other, PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
