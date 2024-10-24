/**
 * Class Property used to model a property for real state companies.
 *
 * @author Alan Riveros.
 * @version 1.0
 */
public class Property
{
    private  double       priceInUsd;
    private final Address address;
    private final int numberOfBedRooms;
    private final boolean isSwimmingPool;
    private final String  type;
    private final String  propertyId;

    Property(final double  priceInUsd,
             final Address adress,
             final int     numberOfBeedRooms,
             final boolean isSwimmingPool,
             final String  type,
             final String  propertyId)
    {
        if(priceInUsd < 0)
        {
            throw new IllegalArgumentException("Invalid price: " + priceInUsd);
        }
        if(adress == null)
        {
            throw new NullPointerException("Invalid address: " + adress);
        }
        if (numberOfBeedRooms < 1 || numberOfBeedRooms > 20) {
            throw new IllegalArgumentException("Invalid number of bedrooms: " + numberOfBeedRooms);
        }
        this.priceInUsd        = priceInUsd;
        this.address           =    adress;
        this.numberOfBedRooms = numberOfBeedRooms;
        this.isSwimmingPool    = isSwimmingPool;
        this.type              = type;
        this.propertyId        = propertyId;

    }

    public double getPriceUsd()
    {
        return priceInUsd;
    }

    public Address getAddress()
    {
        return address;
    }

    public int getNumberOfBedrooms()
    {
        return numberOfBedRooms;
    }


    public boolean hasSwimmingPool()
    {
        return isSwimmingPool;
    }


    public String getType()
    {
        return type;
    }


    public String getPropertyId()
    {
        return propertyId;
    }


    public void setPriceUsd(final double priceUsd)
    {
        if(priceUsd <= 0)
            {
                throw new IllegalArgumentException("Invalid price: " + priceUsd);
            }
        this.priceInUsd = priceUsd;
    }

    public boolean is() {
        if (type == null) {
            return false;
        }
        return true;
    }
}
