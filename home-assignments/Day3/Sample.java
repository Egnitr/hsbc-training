interface intfA 
{ 
    void name(); 
} 
  
interface intfB extends intfA 
{ 
    void institute(); 
} 

class Sample implements intfB 
{ 
    @Override
    public void name() 
    { 
        System.out.println("Rohit"); 
    } 
  
    @Override
    public void institute() 
    { 
        System.out.println("JIIT"); 
    } 
  
    public static void main (String[] args) 
    { 
        Sample ob1 = new Sample(); 
        ob1.name(); 
        ob1.institute(); 
    } 
} 