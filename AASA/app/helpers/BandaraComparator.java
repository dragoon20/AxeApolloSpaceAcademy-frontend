package helpers;

import models.Bandara;

import java.util.Comparator;

public class BandaraComparator implements Comparator<Bandara>
{
    @Override
    public int compare(Bandara o1, Bandara o2) {
        return o1.daerah.compareToIgnoreCase(o2.daerah);
    }
}