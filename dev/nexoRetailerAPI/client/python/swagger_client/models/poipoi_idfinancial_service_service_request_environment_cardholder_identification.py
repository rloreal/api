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

class PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification(object):
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
        'alien_registration_number': 'object',
        'customer_number': 'object',
        'department': 'object',
        'driver_identification': 'object',
        'driver_license_location': 'object',
        'driver_license_number': 'object',
        'driver_license_name': 'object',
        'date_and_place_of_birth': 'PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth',
        'email_address': 'object',
        'identity_card_number': 'object',
        'job_number': 'object',
        'employee_identification_number': 'object',
        'employer_identification_number': 'object',
        'other': 'object',
        'passport_number': 'object',
        'social_security_number': 'object',
        'tax_identification_number': 'object'
    }

    attribute_map = {
        'alien_registration_number': 'AlienRegistrationNumber',
        'customer_number': 'CustomerNumber',
        'department': 'Department',
        'driver_identification': 'DriverIdentification',
        'driver_license_location': 'DriverLicenseLocation',
        'driver_license_number': 'DriverLicenseNumber',
        'driver_license_name': 'DriverLicenseName',
        'date_and_place_of_birth': 'DateAndPlaceOfBirth',
        'email_address': 'EmailAddress',
        'identity_card_number': 'IdentityCardNumber',
        'job_number': 'JobNumber',
        'employee_identification_number': 'EmployeeIdentificationNumber',
        'employer_identification_number': 'EmployerIdentificationNumber',
        'other': 'Other',
        'passport_number': 'PassportNumber',
        'social_security_number': 'SocialSecurityNumber',
        'tax_identification_number': 'TaxIdentificationNumber'
    }

    def __init__(self, alien_registration_number=None, customer_number=None, department=None, driver_identification=None, driver_license_location=None, driver_license_number=None, driver_license_name=None, date_and_place_of_birth=None, email_address=None, identity_card_number=None, job_number=None, employee_identification_number=None, employer_identification_number=None, other=None, passport_number=None, social_security_number=None, tax_identification_number=None):  # noqa: E501
        """PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification - a model defined in Swagger"""  # noqa: E501
        self._alien_registration_number = None
        self._customer_number = None
        self._department = None
        self._driver_identification = None
        self._driver_license_location = None
        self._driver_license_number = None
        self._driver_license_name = None
        self._date_and_place_of_birth = None
        self._email_address = None
        self._identity_card_number = None
        self._job_number = None
        self._employee_identification_number = None
        self._employer_identification_number = None
        self._other = None
        self._passport_number = None
        self._social_security_number = None
        self._tax_identification_number = None
        self.discriminator = None
        if alien_registration_number is not None:
            self.alien_registration_number = alien_registration_number
        if customer_number is not None:
            self.customer_number = customer_number
        if department is not None:
            self.department = department
        if driver_identification is not None:
            self.driver_identification = driver_identification
        if driver_license_location is not None:
            self.driver_license_location = driver_license_location
        if driver_license_number is not None:
            self.driver_license_number = driver_license_number
        if driver_license_name is not None:
            self.driver_license_name = driver_license_name
        if date_and_place_of_birth is not None:
            self.date_and_place_of_birth = date_and_place_of_birth
        if email_address is not None:
            self.email_address = email_address
        if identity_card_number is not None:
            self.identity_card_number = identity_card_number
        if job_number is not None:
            self.job_number = job_number
        if employee_identification_number is not None:
            self.employee_identification_number = employee_identification_number
        if employer_identification_number is not None:
            self.employer_identification_number = employer_identification_number
        if other is not None:
            self.other = other
        if passport_number is not None:
            self.passport_number = passport_number
        if social_security_number is not None:
            self.social_security_number = social_security_number
        if tax_identification_number is not None:
            self.tax_identification_number = tax_identification_number

    @property
    def alien_registration_number(self):
        """Gets the alien_registration_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The alien_registration_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :rtype: object
        """
        return self._alien_registration_number

    @alien_registration_number.setter
    def alien_registration_number(self, alien_registration_number):
        """Sets the alien_registration_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param alien_registration_number: The alien_registration_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :type: object
        """

        self._alien_registration_number = alien_registration_number

    @property
    def customer_number(self):
        """Gets the customer_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The customer_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :rtype: object
        """
        return self._customer_number

    @customer_number.setter
    def customer_number(self, customer_number):
        """Sets the customer_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param customer_number: The customer_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :type: object
        """

        self._customer_number = customer_number

    @property
    def department(self):
        """Gets the department of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The department of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :rtype: object
        """
        return self._department

    @department.setter
    def department(self, department):
        """Sets the department of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param department: The department of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :type: object
        """

        self._department = department

    @property
    def driver_identification(self):
        """Gets the driver_identification of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The driver_identification of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :rtype: object
        """
        return self._driver_identification

    @driver_identification.setter
    def driver_identification(self, driver_identification):
        """Sets the driver_identification of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param driver_identification: The driver_identification of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :type: object
        """

        self._driver_identification = driver_identification

    @property
    def driver_license_location(self):
        """Gets the driver_license_location of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The driver_license_location of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :rtype: object
        """
        return self._driver_license_location

    @driver_license_location.setter
    def driver_license_location(self, driver_license_location):
        """Sets the driver_license_location of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param driver_license_location: The driver_license_location of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :type: object
        """

        self._driver_license_location = driver_license_location

    @property
    def driver_license_number(self):
        """Gets the driver_license_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The driver_license_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :rtype: object
        """
        return self._driver_license_number

    @driver_license_number.setter
    def driver_license_number(self, driver_license_number):
        """Sets the driver_license_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param driver_license_number: The driver_license_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :type: object
        """

        self._driver_license_number = driver_license_number

    @property
    def driver_license_name(self):
        """Gets the driver_license_name of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The driver_license_name of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :rtype: object
        """
        return self._driver_license_name

    @driver_license_name.setter
    def driver_license_name(self, driver_license_name):
        """Sets the driver_license_name of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param driver_license_name: The driver_license_name of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :type: object
        """

        self._driver_license_name = driver_license_name

    @property
    def date_and_place_of_birth(self):
        """Gets the date_and_place_of_birth of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501


        :return: The date_and_place_of_birth of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :rtype: PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth
        """
        return self._date_and_place_of_birth

    @date_and_place_of_birth.setter
    def date_and_place_of_birth(self, date_and_place_of_birth):
        """Sets the date_and_place_of_birth of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.


        :param date_and_place_of_birth: The date_and_place_of_birth of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :type: PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth
        """

        self._date_and_place_of_birth = date_and_place_of_birth

    @property
    def email_address(self):
        """Gets the email_address of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501

        Specifies a character string with a maximum length of 256 characters.<br/>  # noqa: E501

        :return: The email_address of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :rtype: object
        """
        return self._email_address

    @email_address.setter
    def email_address(self, email_address):
        """Sets the email_address of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.

        Specifies a character string with a maximum length of 256 characters.<br/>  # noqa: E501

        :param email_address: The email_address of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :type: object
        """

        self._email_address = email_address

    @property
    def identity_card_number(self):
        """Gets the identity_card_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The identity_card_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :rtype: object
        """
        return self._identity_card_number

    @identity_card_number.setter
    def identity_card_number(self, identity_card_number):
        """Sets the identity_card_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param identity_card_number: The identity_card_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :type: object
        """

        self._identity_card_number = identity_card_number

    @property
    def job_number(self):
        """Gets the job_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The job_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :rtype: object
        """
        return self._job_number

    @job_number.setter
    def job_number(self, job_number):
        """Sets the job_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param job_number: The job_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :type: object
        """

        self._job_number = job_number

    @property
    def employee_identification_number(self):
        """Gets the employee_identification_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The employee_identification_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :rtype: object
        """
        return self._employee_identification_number

    @employee_identification_number.setter
    def employee_identification_number(self, employee_identification_number):
        """Sets the employee_identification_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param employee_identification_number: The employee_identification_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :type: object
        """

        self._employee_identification_number = employee_identification_number

    @property
    def employer_identification_number(self):
        """Gets the employer_identification_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The employer_identification_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :rtype: object
        """
        return self._employer_identification_number

    @employer_identification_number.setter
    def employer_identification_number(self, employer_identification_number):
        """Sets the employer_identification_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param employer_identification_number: The employer_identification_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :type: object
        """

        self._employer_identification_number = employer_identification_number

    @property
    def other(self):
        """Gets the other of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501

        Unique identification of a person, as assigned by an institution, using an identification scheme.  # noqa: E501

        :return: The other of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :rtype: object
        """
        return self._other

    @other.setter
    def other(self, other):
        """Sets the other of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.

        Unique identification of a person, as assigned by an institution, using an identification scheme.  # noqa: E501

        :param other: The other of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :type: object
        """

        self._other = other

    @property
    def passport_number(self):
        """Gets the passport_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The passport_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :rtype: object
        """
        return self._passport_number

    @passport_number.setter
    def passport_number(self, passport_number):
        """Sets the passport_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param passport_number: The passport_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :type: object
        """

        self._passport_number = passport_number

    @property
    def social_security_number(self):
        """Gets the social_security_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The social_security_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :rtype: object
        """
        return self._social_security_number

    @social_security_number.setter
    def social_security_number(self, social_security_number):
        """Sets the social_security_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param social_security_number: The social_security_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :type: object
        """

        self._social_security_number = social_security_number

    @property
    def tax_identification_number(self):
        """Gets the tax_identification_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The tax_identification_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :rtype: object
        """
        return self._tax_identification_number

    @tax_identification_number.setter
    def tax_identification_number(self, tax_identification_number):
        """Sets the tax_identification_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param tax_identification_number: The tax_identification_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.  # noqa: E501
        :type: object
        """

        self._tax_identification_number = tax_identification_number

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
        if issubclass(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification, dict):
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
        if not isinstance(other, PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
