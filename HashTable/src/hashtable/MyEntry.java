
package hashtable;

public class MyEntry
{
    private int key;
    private String value;
    
    public MyEntry(int k, String v)
    {
        key = k;
        value = v;
    }
    
    public int getKey()
    {
        return key;
    }
    
    public String getValue()
    {
        return value;
    }
}
