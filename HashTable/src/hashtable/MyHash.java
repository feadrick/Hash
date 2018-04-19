
package hashtable;


public class MyHash
{
    private static final int TABLE_SIZE = 5;
    
    private MyEntry[] table;
    private int bil, size;
    
    public MyHash()
    {
        size = TABLE_SIZE;
        table = new MyEntry[size];
        bil = 0;
    }
    
    
    public MyHash(int s)
    {
        size = s;
        table = new MyEntry[size];
        bil = 0;
    }
    
    
    public boolean isEmpty()
    {
        return bil==0;
    }
    
    public boolean isFull()
    {
        return bil==size;
    }
    
    private int hashFun(int k)
    {
        return k%size;
    }
    
    public boolean add(int k, String v)
    {
        int ind, i=0;
        if(!isFull())
        {
            ind = hashFun(k);
            while(++i<=size)
            {
                if(table[ind]==null)
                {
                    table[ind] = new MyEntry(k,v);
                    ++bil;
                    System.out.println("Added...: ("+k+"-> "+v+")");
                    return true;
                }
                else
                    ind = hashFun(ind+1);
            }
            return false;
        }else
            return false;
    }
    
//     public boolean del(int k)
//     {
//         
//     }
    
    public String getVAL(int k)
    {
        int ind, i=0;
        if(!isEmpty())
        {
            ind = hashFun(k);
            while(++i<=size)
            {
                if((table[ind]!=null)&&(table[ind].getKey()==k))
                    return table[ind].getValue();
                else
                    ind = hashFun(ind+1);
            }
            return null;
        }else
            return null;
    }
    
    public int getKEY(String v)
    {
        int i=0;
        if(!isEmpty())
        {
            while(i<size)
            {
                if((table[i]!=null)&&(table[i].getValue().equals(v)))
                    return table[i].getKey();
                ++i;
            }
            return -1;
        }else
            return -1;
    }
    
    public void print()
    {
        int i=0,x=0;
        if(!isEmpty())
        {
            while(i<size && x<bil)
            {
                if(table[i]!=null)
                {
                    ++x;
                    System.out.println("Key: "+table[i].getKey()+"\nValue: "+table[i].getValue());
                }
                ++i;
            }
        }else
            System.out.println("Empty");
    }
    
    public void clearALL()
    {
        table = new MyEntry[size];
        bil = 0;
    }
    
    public int getBIL()
    {
        return bil;
    }
}
