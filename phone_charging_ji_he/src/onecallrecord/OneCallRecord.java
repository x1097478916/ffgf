package onecallrecord;

public class OneCallRecord {
	
	public	String host;
      public  String callto;
      public	Long starttime;
      public	long endtime;
		public OneCallRecord(String host,String callto,long starttime,long endtime){
			this.host=host;
			this.callto=callto;
			this.starttime=starttime;
			this.endtime=endtime;
	}
		public int hashCode() {
			return starttime.hashCode();
		}
		public boolean equals(Object obj) {
			if(this==obj)
				return true;
			else if(!(obj instanceof OneCallRecord ))
			return false;
			else {
				OneCallRecord ocr=(OneCallRecord) obj;
				boolean b=this.starttime.equals(ocr.starttime);
				return b;
				}
			}
		
		
	}

