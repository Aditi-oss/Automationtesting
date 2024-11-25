package ex_InheritanceExample.example2.Example2.real;

public class TestCase1 extends BaseTest{
    TestCase1()
    {
        System.out.println("DC-Child");
    }
    void testcase()
    {
        StarterBrowser();
        readExcelfile();
        Closebrowser();

    }
}
