package Model;

public class Calculos {
	
	public float vdi,vcom,vadi,veta,v500ml,v1l,q500ml,q1l,t500ml,t1l,tcomb,toli;
	public String TT;
	
    public String ToCombustivel (float ql) 
    {
    	String Total = String.valueOf(vcom*ql);
    	tcomb=Float.valueOf(Total);
		return Total;
    	
    }
    
    public String ToAditiv (float ql)
    {
		String Total = String.valueOf(vadi*ql);
		tcomb=Float.valueOf(Total);
		return Total;
	}
    
    public String ToDiesel (float ql) 
    {
    	String Total=String.valueOf(vdi*ql);
		tcomb=Float.valueOf(Total);
		return Total;
	}
    
    public String ToEtanol (float ql) 
    {
		String Total = String.valueOf(veta*ql);
		tcomb=Float.valueOf(Total);
		return Total;
	}
    
    public String ToF500 () 
    {
			String Total=String.valueOf(q500ml*v500ml);
			t500ml=Float.valueOf(Total);
			return Total;
		}
    
    public String ToF1l () 
    {
			String Total = String.valueOf(q1l*v1l);
			t1l=Float.valueOf(Total);
			return Total;
		}
    
    public String Tooleo () 
    {
    		String Total = String.valueOf(t500ml+t1l);
    		toli=Float.valueOf(Total);
			return Total;
		}
    
    public String ToAvista () 
    {
    		String Total = String.valueOf((tcomb+toli) - ((tcomb+toli)*0.10));
			return Total;
		}
   
    public String ToAprazo () 
    {
    		String Total = String.valueOf(tcomb+toli);
			return Total;
		}

    public String ToAprazo30 () 
    {
    		String Total = String.valueOf((tcomb+toli) + ((tcomb+toli)*0.10));
			return Total;
		}
    
    }


