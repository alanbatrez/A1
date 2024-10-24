import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Class Address module the address of users with the provided data.
 *
 * @author Alan Riveros.
 * @version 1.0
 */
class Address {
    private final String unitNumber;
    private final int    streetNumber;
    private final String streetName;
    private final String postalCode;
    private final String cityName;


    private final int MINIMAL_LENGTH_UNIT_NUMBER = 1;
    private final int MAXIMUM_LENGTH_UNIT_NUMBER = 4;

    private final int MINIMAL_VALUE_STREET_NUMBER = 0;
    private final int MAXIMUM_VALUE_STREET_NUMBER = 999999;

    private final int MINIMAL_LENGTH_STREET_NAME = 1;
    private final int MAXIMUM_LENGTH_STREET_NAME = 20;

    private final int MINIMAL_LENGTH_POSTAL_CODE = 5;
    private final int MAXIMUM_LENGTH_POSTAL_CODE = 6;

    private final int MINIMAL_LENGTH_CITY_NAME = 1;
    private final int MAXIMUM_LENGTH_CITY_NAME = 30;


    /**
     * The constructor for the class Address.
     * @param unitNumber   Takes the unit number of the user and could be 1 or 4 characters.
     * @param streetNumber Takes integers to the street number of the user.
     * @param streetName   Takes the street name of the user.
     * @param postalCode   Takes the postal code of the user.
     * @param cityName     Takes the city name.
     */
    Address(final String unitNumber,
                   final int    streetNumber,
                   final String streetName,
                   final String postalCode,
                   final String cityName)
    {

        if(!UnitNumberValidator(unitNumber))
            {
                throw new IllegalArgumentException("Invalid unit number: " + unitNumber);
            }

        if(!StreetNumberValidator(streetNumber))
            {
                throw new IllegalArgumentException("Invalid street number: " + streetNumber);
            }

        if (!StreetNameValidator(streetName))
            {
                throw new IllegalArgumentException("Invalid street name: " + streetName);
            }

        if(streetName == null )
            {
                throw new NullPointerException("Invalid street name: " + streetName);
            }

        if(postalCode == null || postalCode.isBlank())
            {
                throw new NullPointerException("Invalid postal code: " + postalCode);
            }

        if (!PostalCodeValidator(postalCode))
            {
                throw new IllegalArgumentException("Invalid postal code: " + postalCode);
            }

        if(cityName == null)
            {
                throw new NullPointerException("Invalid city: " + cityName);
            }

        if (!CityNameValidator(cityName))
            {
                throw new IllegalArgumentException("Invalid city: " + cityName);
            }


        this.unitNumber   = unitNumber;
        this.streetNumber = streetNumber;
        this.streetName   = streetName;
        this.postalCode   = postalCode;
        this.cityName     = cityName;


    }


    /**
     * Method used to get the unit number.
     * @return The unit number.
     */
    public String getUnitNumber()
    {
        return unitNumber;
    }


    /**
     * Method used to get the street number.
     * @return The street number.
     */
    public int getStreetNumber()
    {
        return streetNumber;
    }


    /**
     * Method used to get the street name.
     * @return The street number.
     */
    public String getStreetName()
    {
        return streetName;
    }


    /**
     * Method used to get the postal code.
     * @return The postal code.
     */
    public String getPostalCode()
    {
        return postalCode;
    }


    /**
     * Method used to get the city name.
     * @return The city name.
     */
    public String getCity()
    {
        return cityName;
    }


    /**
     * Method used to validate if the unit number is correct(No more than 4 characters and not less than 1 character).
     * @param unitNumberToCheck Takes the unit number to validate.
     * @return Return true if accomplish the criteria and false if not.
     */
    public boolean UnitNumberValidator(final String unitNumberToCheck)
    {
        if(unitNumberToCheck == null ||
           unitNumberToCheck.length() >= MINIMAL_LENGTH_UNIT_NUMBER &&
           unitNumberToCheck.length() <= MAXIMUM_LENGTH_UNIT_NUMBER)
            {
                return true;
            }
        return false;
    }


    /**
     * Method used to validate if the street number is correct(No more than 999,999 characters and
     * not less than 0 character).
     * @param  streetNumberToCheck Takes the street number to validate.
     * @return Return true if accomplish the criteria and false if not.
     */
    public boolean StreetNumberValidator(final int streetNumberToCheck)
    {
        if(streetNumberToCheck >= MINIMAL_VALUE_STREET_NUMBER &&
           streetNumberToCheck  <= MAXIMUM_VALUE_STREET_NUMBER)
            {
                return true;
            }
        return false;
    }


    /**
     * Method  used to validate if the street name is correct(No more than 20 characters and not less than 1 character).
     * @param  streetNameToCheck Takes the street name to validate.
     * @return Return true if accomplish the criteria and false if not.
     */
    public boolean StreetNameValidator(final String streetNameToCheck)
    {
     if(streetNameToCheck == null ||
        streetNameToCheck.length() >= MINIMAL_LENGTH_STREET_NAME &&
        streetNameToCheck.length() <= MAXIMUM_LENGTH_STREET_NAME)
        {
            return true;
        }
     return false;
    }

    /**
     * Method used to validate if the postal code is correct(No more than 6 characters and not less than 5 character).
     * @param  postalCodeToCheck Takes the postal code to validate.
     * @return Return true if accomplish the criteria and false if not.
     */
    public boolean PostalCodeValidator(final String postalCodeToCheck)
    {
        if(postalCodeToCheck == null ||
           postalCodeToCheck.length() >= MINIMAL_LENGTH_POSTAL_CODE &&
           postalCodeToCheck.length() <= MAXIMUM_LENGTH_POSTAL_CODE)
            {
                return true;
            }
        return false;
    }


    /**
     * Method used to validate if the city name is correct(No more than 30 characters and not less than 1 character).
     * @param  cityNameToCheck Takes the city name to validate.
     * @return Return true if accomplish the criteria and false if not.
     */
    public boolean CityNameValidator(final String cityNameToCheck)
    {
        if(cityNameToCheck == null ||
           cityNameToCheck.length() >= MINIMAL_LENGTH_CITY_NAME &&
           cityNameToCheck.length() <= MAXIMUM_LENGTH_CITY_NAME)
            {
                return true;
            }
        return false;
    }
}

