

public class DriverLicenseTest
{
    public static void main(String[] args)
    {
        DriverLicense dl = new DriverLicense(132, true, false);
        System.out.println(dl.toString());
        DriverLicense dl2 = new DriverLicense(133, true);
        System.out.println(dl2.toString());
        DriverLicense dl3 = new DriverLicense(134);
        System.out.println(dl3.toString());
    }
}
