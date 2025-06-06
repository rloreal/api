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

class PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle(object):
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
        'additional_vehicle_data': 'object',
        'driver_or_vehicle_card': 'PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard',
        'hubometer': 'object',
        'maintenance_identification': 'object',
        'odometer': 'object',
        'refer_hours': 'object',
        'replacement_car': 'object',
        'trailer_hours': 'object',
        'trailer_number': 'object',
        'unit_number': 'object',
        'vehicle_number': 'object',
        'vehicle_tag': 'object',
        'vehicle_tag_entry_mode': 'object'
    }

    attribute_map = {
        'additional_vehicle_data': 'AdditionalVehicleData',
        'driver_or_vehicle_card': 'DriverOrVehicleCard',
        'hubometer': 'Hubometer',
        'maintenance_identification': 'MaintenanceIdentification',
        'odometer': 'Odometer',
        'refer_hours': 'ReferHours',
        'replacement_car': 'ReplacementCar',
        'trailer_hours': 'TrailerHours',
        'trailer_number': 'TrailerNumber',
        'unit_number': 'UnitNumber',
        'vehicle_number': 'VehicleNumber',
        'vehicle_tag': 'VehicleTag',
        'vehicle_tag_entry_mode': 'VehicleTagEntryMode'
    }

    def __init__(self, additional_vehicle_data=None, driver_or_vehicle_card=None, hubometer=None, maintenance_identification=None, odometer=None, refer_hours=None, replacement_car=None, trailer_hours=None, trailer_number=None, unit_number=None, vehicle_number=None, vehicle_tag=None, vehicle_tag_entry_mode=None):  # noqa: E501
        """PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle - a model defined in Swagger"""  # noqa: E501
        self._additional_vehicle_data = None
        self._driver_or_vehicle_card = None
        self._hubometer = None
        self._maintenance_identification = None
        self._odometer = None
        self._refer_hours = None
        self._replacement_car = None
        self._trailer_hours = None
        self._trailer_number = None
        self._unit_number = None
        self._vehicle_number = None
        self._vehicle_tag = None
        self._vehicle_tag_entry_mode = None
        self.discriminator = None
        if additional_vehicle_data is not None:
            self.additional_vehicle_data = additional_vehicle_data
        if driver_or_vehicle_card is not None:
            self.driver_or_vehicle_card = driver_or_vehicle_card
        if hubometer is not None:
            self.hubometer = hubometer
        if maintenance_identification is not None:
            self.maintenance_identification = maintenance_identification
        if odometer is not None:
            self.odometer = odometer
        if refer_hours is not None:
            self.refer_hours = refer_hours
        if replacement_car is not None:
            self.replacement_car = replacement_car
        if trailer_hours is not None:
            self.trailer_hours = trailer_hours
        if trailer_number is not None:
            self.trailer_number = trailer_number
        if unit_number is not None:
            self.unit_number = unit_number
        if vehicle_number is not None:
            self.vehicle_number = vehicle_number
        if vehicle_tag is not None:
            self.vehicle_tag = vehicle_tag
        if vehicle_tag_entry_mode is not None:
            self.vehicle_tag_entry_mode = vehicle_tag_entry_mode

    @property
    def additional_vehicle_data(self):
        """Gets the additional_vehicle_data of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501

        Additional information related to the vehicle.  # noqa: E501

        :return: The additional_vehicle_data of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :rtype: object
        """
        return self._additional_vehicle_data

    @additional_vehicle_data.setter
    def additional_vehicle_data(self, additional_vehicle_data):
        """Sets the additional_vehicle_data of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.

        Additional information related to the vehicle.  # noqa: E501

        :param additional_vehicle_data: The additional_vehicle_data of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :type: object
        """

        self._additional_vehicle_data = additional_vehicle_data

    @property
    def driver_or_vehicle_card(self):
        """Gets the driver_or_vehicle_card of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501


        :return: The driver_or_vehicle_card of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :rtype: PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard
        """
        return self._driver_or_vehicle_card

    @driver_or_vehicle_card.setter
    def driver_or_vehicle_card(self, driver_or_vehicle_card):
        """Sets the driver_or_vehicle_card of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.


        :param driver_or_vehicle_card: The driver_or_vehicle_card of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :type: PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard
        """

        self._driver_or_vehicle_card = driver_or_vehicle_card

    @property
    def hubometer(self):
        """Gets the hubometer of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501

        Number of objects represented as a decimal number, for example 0.75 or 45.6.<br/>  # noqa: E501

        :return: The hubometer of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :rtype: object
        """
        return self._hubometer

    @hubometer.setter
    def hubometer(self, hubometer):
        """Sets the hubometer of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.

        Number of objects represented as a decimal number, for example 0.75 or 45.6.<br/>  # noqa: E501

        :param hubometer: The hubometer of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :type: object
        """

        self._hubometer = hubometer

    @property
    def maintenance_identification(self):
        """Gets the maintenance_identification of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The maintenance_identification of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :rtype: object
        """
        return self._maintenance_identification

    @maintenance_identification.setter
    def maintenance_identification(self, maintenance_identification):
        """Sets the maintenance_identification of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param maintenance_identification: The maintenance_identification of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :type: object
        """

        self._maintenance_identification = maintenance_identification

    @property
    def odometer(self):
        """Gets the odometer of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501

        Number of objects represented as a decimal number, for example 0.75 or 45.6.<br/>  # noqa: E501

        :return: The odometer of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :rtype: object
        """
        return self._odometer

    @odometer.setter
    def odometer(self, odometer):
        """Sets the odometer of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.

        Number of objects represented as a decimal number, for example 0.75 or 45.6.<br/>  # noqa: E501

        :param odometer: The odometer of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :type: object
        """

        self._odometer = odometer

    @property
    def refer_hours(self):
        """Gets the refer_hours of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The refer_hours of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :rtype: object
        """
        return self._refer_hours

    @refer_hours.setter
    def refer_hours(self, refer_hours):
        """Sets the refer_hours of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param refer_hours: The refer_hours of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :type: object
        """

        self._refer_hours = refer_hours

    @property
    def replacement_car(self):
        """Gets the replacement_car of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501

        A flag indicating a True or False value.<br/>  # noqa: E501

        :return: The replacement_car of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :rtype: object
        """
        return self._replacement_car

    @replacement_car.setter
    def replacement_car(self, replacement_car):
        """Sets the replacement_car of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.

        A flag indicating a True or False value.<br/>  # noqa: E501

        :param replacement_car: The replacement_car of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :type: object
        """

        self._replacement_car = replacement_car

    @property
    def trailer_hours(self):
        """Gets the trailer_hours of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The trailer_hours of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :rtype: object
        """
        return self._trailer_hours

    @trailer_hours.setter
    def trailer_hours(self, trailer_hours):
        """Sets the trailer_hours of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param trailer_hours: The trailer_hours of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :type: object
        """

        self._trailer_hours = trailer_hours

    @property
    def trailer_number(self):
        """Gets the trailer_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501

        Specifies a numeric string with a maximum length of 35 digits.<br/>  # noqa: E501

        :return: The trailer_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :rtype: object
        """
        return self._trailer_number

    @trailer_number.setter
    def trailer_number(self, trailer_number):
        """Sets the trailer_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.

        Specifies a numeric string with a maximum length of 35 digits.<br/>  # noqa: E501

        :param trailer_number: The trailer_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :type: object
        """

        self._trailer_number = trailer_number

    @property
    def unit_number(self):
        """Gets the unit_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501

        Specifies a numeric string with a maximum length of 35 digits.<br/>  # noqa: E501

        :return: The unit_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :rtype: object
        """
        return self._unit_number

    @unit_number.setter
    def unit_number(self, unit_number):
        """Sets the unit_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.

        Specifies a numeric string with a maximum length of 35 digits.<br/>  # noqa: E501

        :param unit_number: The unit_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :type: object
        """

        self._unit_number = unit_number

    @property
    def vehicle_number(self):
        """Gets the vehicle_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501

        Specifies a numeric string with a maximum length of 35 digits.<br/>  # noqa: E501

        :return: The vehicle_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :rtype: object
        """
        return self._vehicle_number

    @vehicle_number.setter
    def vehicle_number(self, vehicle_number):
        """Sets the vehicle_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.

        Specifies a numeric string with a maximum length of 35 digits.<br/>  # noqa: E501

        :param vehicle_number: The vehicle_number of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :type: object
        """

        self._vehicle_number = vehicle_number

    @property
    def vehicle_tag(self):
        """Gets the vehicle_tag of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :return: The vehicle_tag of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :rtype: object
        """
        return self._vehicle_tag

    @vehicle_tag.setter
    def vehicle_tag(self, vehicle_tag):
        """Sets the vehicle_tag of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.

        Specifies a character string with a maximum length of 35 characters.<br/>  # noqa: E501

        :param vehicle_tag: The vehicle_tag of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :type: object
        """

        self._vehicle_tag = vehicle_tag

    @property
    def vehicle_tag_entry_mode(self):
        """Gets the vehicle_tag_entry_mode of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501

        Type of reading of the card data.<br/>- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*<br/>- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*<br/>- **BRCD: BarCode**  : *Bar code.*<br/>- **MGST: MagneticStripe**  : *Magnetic stripe.*<br/>- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*<br/>- **DFLE: AccountData**  : *Account data on file.*<br/>- **CTLS: ProximityReader**  : *Contactless proximity reader.*<br/>- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*<br/>- **CDFL: CardOnFile**  : *Card information are stored on a file.*<br/>  # noqa: E501

        :return: The vehicle_tag_entry_mode of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :rtype: object
        """
        return self._vehicle_tag_entry_mode

    @vehicle_tag_entry_mode.setter
    def vehicle_tag_entry_mode(self, vehicle_tag_entry_mode):
        """Sets the vehicle_tag_entry_mode of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.

        Type of reading of the card data.<br/>- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*<br/>- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*<br/>- **BRCD: BarCode**  : *Bar code.*<br/>- **MGST: MagneticStripe**  : *Magnetic stripe.*<br/>- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*<br/>- **DFLE: AccountData**  : *Account data on file.*<br/>- **CTLS: ProximityReader**  : *Contactless proximity reader.*<br/>- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*<br/>- **CDFL: CardOnFile**  : *Card information are stored on a file.*<br/>  # noqa: E501

        :param vehicle_tag_entry_mode: The vehicle_tag_entry_mode of this PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.  # noqa: E501
        :type: object
        """

        self._vehicle_tag_entry_mode = vehicle_tag_entry_mode

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
        if issubclass(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle, dict):
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
        if not isinstance(other, PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
