/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Mariya
 */
@WebService(serviceName = "WebServiceNew")
public class WebServiceNew {
ConnectionClass con=new ConnectionClass();
    /**
     * This is a sample web service operation
     */

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Registration")
    public String Registration(@WebParam(name = "Name") String Name, @WebParam(name = "Address") String Address,@WebParam(name = "Gender") String Gender,@WebParam(name = "Place") String Place, @WebParam(name = "Age") String Age, @WebParam(name = "Email") String Email, @WebParam(name = "Phone") String Phone, @WebParam(name = "District") String District,@WebParam(name = "Pincode") String Pincode,@WebParam(name = "AccountNo") String AccountNo, @WebParam(name = "User") String User, @WebParam(name = "Password") String Password) {
        //TODO write your implementation code here:
        
        
      
         String insert="insert into tbl_custreg(custreg_name,custreg_hname,custreg_gender,place_id,custreg_age,custreg_email,custreg_phno,custreg_district,custreg_pin,custreg_accno,custreg_uname,custreg_pswd)values('"+Name+"','"+Address+"','"+Gender+"','"+Place+"','"+Age+"','"+Email+"','"+Phone+"','"+District+"','"+Pincode+"','"+AccountNo+"','"+User+"','"+Password+"')";
         
         System.out.println("reg:\t"+insert);
         
         boolean b=con.insert(insert);
         String a="false";
         if(b)
         {
             a="true";
         }
         return a;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "selectoperation")
    public String selectoperation(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        String sel="select * from tbl_custreg where custreg_uname='"+username+"' and custreg_pswd='"+password+"'";
        System.out.println(sel);
        ResultSet rs=con.select(sel);
         JSONArray j=new JSONArray();
        String s="false";
        String name="";
        try {
            if(rs.next())
            {
                 JSONObject jo= new JSONObject();
                s=rs.getString("custreg_id");
                name=rs.getString("custreg_name");
                jo.put("id",s);
                jo.put("name",name);
                
                j.put(jo);
            }
        } catch (Exception ex) {
            
        }
        System.out.println("s"+s);
         return j.toString();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getplaceoperation")
    public String getplaceoperation() {
        //TODO write your implementation code here:
        JSONArray j=new JSONArray();
        String sele="select* from tbl_place";
        ResultSet r=con.select(sele);
        String s="false";
        String a;
       try {
            while(r.next())
            {
                JSONObject jo= new JSONObject();
                
                s=r.getString("place_id");
                a=r.getString("place_name");
                jo.put("pid",s);
                jo.put("namid",a);
                
                j.put(jo);
                
            }
        } catch (SQLException ex) {
            
        } catch (JSONException ex) {
        Logger.getLogger(WebServiceNew.class.getName()).log(Level.SEVERE, null, ex);
    }
        return j.toString();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "fetchoperation")
    public String fetchoperation(@WebParam(name = "Id") String Id) {
        //TODO write your implementation code here:
        String  st="select * from tbl_custreg cs inner join tbl_place p on cs.place_id=p.place_id where custreg_id='"+Id+"'";
        ResultSet r=con.select(st);
        JSONArray ja=null;
        try {
            while(r.next())
            {
                ja=new JSONArray();
                JSONObject jb=new JSONObject();
                
                 String n1=r.getString("custreg_name");
                 String n2=r.getString("custreg_hname");
                 String n3=r.getString("custreg_gender");
                 String n4=r.getString("place_name");
                 String n5=r.getString("custreg_age");
                 String n6=r.getString("custreg_email");
                 String n7=r.getString("custreg_phno");
                 String n8=r.getString("custreg_district");
                 String n9=r.getString("custreg_pin");
                 String n10=r.getString("custreg_accno");
                 String n11=r.getString("custreg_uname");
                 String n12=r.getString("cs.place_id");
                 
              System.out.println("placeid"+n12);
                 
                 jb.put("Name", n1);
                 jb.put("Address", n2);
                 jb.put("Gender", n3);
                 jb.put("Place", n4);
                 jb.put("Age", n5);
                 jb.put("Email", n6);
                 jb.put("Phone", n7);
                 jb.put("District", n8);
                 jb.put("Pincode", n9);
                 jb.put("AccountNo", n10);
                 jb.put("User", n11);
                 jb.put("placeid",n12);
                 ja.put(jb);
            }
        } catch (Exception e) {
        }
        return ja.toString();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "updateoperation")
    public String updateoperation(@WebParam(name = "Id") String Id,@WebParam(name = "Name") String Name, @WebParam(name = "Address") String Address,@WebParam(name = "Gender") String Gender,@WebParam(name = "Place") String Place, @WebParam(name = "Age") String Age, @WebParam(name = "Email") String Email, @WebParam(name = "Phone") String Phone, @WebParam(name = "District") String District,@WebParam(name = "Pincode") String Pincode,@WebParam(name = "AccountNo") String AccountNo) {
        //TODO write your implementation code here:
      String upd="update tbl_custreg set custreg_name='"+Name+"',custreg_hname='"+Address+"',custreg_gender='"+Gender+"',place_id='"+Place+"',custreg_age='"+Age+"',custreg_email='"+Email+"',custreg_phno='"+Phone+"',custreg_district='"+District+"',custreg_pin='"+Pincode+"',custreg_accno='"+AccountNo+"' where custreg_id='"+Id+"'";
      System.out.println(upd); 
      boolean b1=con.insert(upd);
       String ab="false";
       if(b1)
       {
           ab="true";
       }
     
        return ab;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "changeoperation")
    public String changeoperation(@WebParam(name = "Id") String Id, @WebParam(name = "currentpass") String currentpass, @WebParam(name = "newpass") String newpass) {
        String msg="";
        try {
        //TODO write your implementation code here:
        String sel="select custreg_uname from tbl_custreg where custreg_pswd='"+currentpass+"' and custreg_id='"+Id+"'";
        ResultSet rs=con.select(sel);
        System.out.println(sel);
        if(rs.next())
        {
            String upd="update tbl_custreg set custreg_pswd='"+newpass+"' where custreg_id='"+Id+"'";
            if(con.insert(upd))
            {
                System.out.println("succesfully upated");
                msg="success";
            }
            
            
            
           else
                
            {
                System.out.println("password missmatch");
                msg="failed";
            }
            
        }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(WebServiceNew.class.getName()).log(Level.SEVERE, null, ex);
    }
            
       return msg;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Registoperation")
    public String Registoperation(@WebParam(name = "Name") String Name,  @WebParam(name = "Place") String Place,@WebParam(name = "Gender") String Gender, @WebParam(name = "Age") String Age, @WebParam(name = "Email") String Email, @WebParam(name = "Phone") String Phone, @WebParam(name = "District") String District, @WebParam(name = "User") String User, @WebParam(name = "Password") String Password) {
        
        String insert="insert into tbl_paperboy(paperboy_name,place_id,paperboy_gender,paperboy_age,paperboy_email,paperboy_phno,paperboy_district,paperboy_uname,paperboy_pswd)values('"+Name+"','"+Place+"','"+Gender+"','"+Age+"','"+Email+"','"+Phone+"','"+District+"','"+User+"','"+Password+"')";
         
         System.out.println("reg:\t"+insert);
         
         boolean b=con.insert(insert);
         String a="false";
         if(b)
         {
             a="true";
         }
         return a;
    }
     @WebMethod(operationName = "seloperation")
    public String seloperation(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        String sel="select * from tbl_paperboy where paperboy_uname='"+username+"' and paperboy_pswd='"+password+"' and paperboy_status=1" ;
        System.out.println(sel);
        ResultSet rs=con.select(sel);
        String s="false";
        try {
            if(rs.next())
            {
                s=rs.getString("paperboy_id");
            }
        } catch (SQLException ex) {
            
        }
        System.out.println("s"+s);
        return s;
        
}
    @WebMethod(operationName = "fetchoperat")
    public String fetchoperat(@WebParam(name = "Id") String Id) {
        //TODO write your implementation code here:
        String  st="select * from tbl_paperboy cs inner join tbl_place p on cs.place_id=p.place_id where paperboy_id='"+Id+"'";
        ResultSet r=con.select(st);
        
        System.out.println(st);
        JSONArray ja=null;
        try {
            while(r.next())
            {
                ja=new JSONArray();
                JSONObject jb=new JSONObject();
                
                 String n1=r.getString("paperboy_name");
                 String n2=r.getString("place_name");
                 String n3=r.getString("paperboy_gender");
                 String n4=r.getString("paperboy_age");
                 String n5=r.getString("paperboy_email");
                 String n6=r.getString("paperboy_phno");
                 String n7=r.getString("paperboy_district");
                 String n8=r.getString("paperboy_uname");
                 String n9=r.getString("cs.place_id");
                 
              System.out.println("placeid"+n9);
                 
                 jb.put("Name", n1);
                 jb.put("Place", n2);
                 jb.put("Gender", n3);
                 jb.put("Age", n4);
                 jb.put("Email", n5);
                 jb.put("Phone", n6);
                 jb.put("District", n7);
                 jb.put("User", n8);
                 jb.put("placeid",n9);
                 ja.put(jb);
            }
        } catch (Exception e) {
        }
        return ja.toString();
    }
    @WebMethod(operationName = "updateoperat")
    public String updateoperat(@WebParam(name = "Id") String Id,@WebParam(name = "Name") String Name,@WebParam(name = "Place") String Place,@WebParam(name = "Gender") String Gender, @WebParam(name = "Age") String Age, @WebParam(name = "Email") String Email, @WebParam(name = "Phone") String Phone, @WebParam(name = "District") String District) {
        //TODO write your implementation code here:
      String upd="update tbl_paperboy set paperboy_name='"+Name+"',place_id='"+Place+"',paperboy_gender='"+Gender+"',paperboy_age='"+Age+"',paperboy_email='"+Email+"',paperboy_phno='"+Phone+"',paperboy_district='"+District+"' where paperboy_id='"+Id+"'";
      
      boolean b1=con.insert(upd);
       String ab="false";
       if(b1)
       {
           ab="true";
       }
     
        return ab;
    }
    
    
    @WebMethod(operationName = "getitemoperation")
    public String getitemoperation() {
        //TODO write your implementation code here:
        JSONArray j=new JSONArray();
        String sele="select* from tbl_item";
        ResultSet r=con.select(sele);
        
        String a,s;
       try {
            while(r.next())
            {
                JSONObject jo= new JSONObject();
                
                s=r.getString("item_id");
                a=r.getString("item_name");
                jo.put("itemid",s);
                jo.put("itemnamid",a);
                
                j.put(jo);
                
            }
        } catch (SQLException ex) {
            
        } catch (JSONException ex) {
        Logger.getLogger(WebServiceNew.class.getName()).log(Level.SEVERE, null, ex);
    }
        return j.toString();
    }
    
    
    @WebMethod(operationName = "getlagoperation")
    public String getlagoperation() {
        //TODO write your implementation code here:
        JSONArray j=new JSONArray();
        String sele="select * from tbl_lang";
        System.out.println(sele);
        ResultSet r=con.select(sele);
        
        String b,t;
       try {
            while(r.next())
            {
                JSONObject jo= new JSONObject();
                
                b=r.getString("lang_id");
                t=r.getString("lang_name");
                jo.put("langid",b);
                jo.put("lnamid",t);
                
                j.put(jo);
                
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (JSONException ex) {
        Logger.getLogger(WebServiceNew.class.getName()).log(Level.SEVERE, null, ex);
    }
        return j.toString();
    }
    
     @WebMethod(operationName = "getprodoperation")
    public String getprodoperation(@WebParam(name = "languageid") String languageid,@WebParam(name = "itemid") String itemid) {
        //TODO write your implementation code here:
        JSONArray j=new JSONArray();
        String sele="select * from tbl_product where lang_id='"+languageid+"' and item_id='"+itemid+"'  ";
        System.out.println("getPodct:\t"+sele);
        ResultSet r=con.select(sele);
        
        String b,t,a,c;
       try {
            while(r.next())
            {
                JSONObject jo= new JSONObject();
                
                a=r.getString("product_id");
                c=r.getString("product_name");
                jo.put("prodid",a);
                jo.put("prodname",c);
                               
                j.put(jo);
                
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (JSONException ex) {
        Logger.getLogger(WebServiceNew.class.getName()).log(Level.SEVERE, null, ex);
    }
        return j.toString();
    }
    
       @WebMethod(operationName = "prodplanoperat")
       public String prodplanoperat(@WebParam(name = "Id") String Id) {
        JSONArray j=new JSONArray();
        String sele="select *from tbl_plan p inner join tbl_prodplan pp on p.plan_id=pp.plan_id where pp.product_id= '"+Id+"'";
        System.out.println("getPodct:\t"+sele);
        ResultSet r=con.select(sele);
        
        String b,a,c;
       try {
            while(r.next())
            {
                JSONObject jo= new JSONObject();
                
                a=r.getString("prodplan_id");
                c=r.getString("plan_type");
                b=r.getString("prodplan_rate");
                jo.put("prodplanid",a);
                jo.put("plantype",c);
                jo.put("prodrate",b);              
                j.put(jo);
                
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (JSONException ex) {
        Logger.getLogger(WebServiceNew.class.getName()).log(Level.SEVERE, null, ex);
    }
        return j.toString();
    }
    @WebMethod(operationName = "insertoperat")
    public String insertoperat(@WebParam(name = "customerid") String customerid,@WebParam(name = "planid") String planid,@WebParam(name = "productid") String productid){
        
        try{ 
              String sel="select * from tbl_booking b inner join tbl_prodplan pp on b.prodplan_id=pp.prodplan_id where custreg_id='"+customerid+"'and pp.product_id='"+productid+"'";
              System.out.println("select statement "+sel);
             ResultSet rs=con.select(sel);
    
             if(rs.next()){
             return "Already Booked";
        
        }else{
            String insert="insert into tbl_booking(booking_date,custreg_id,prodplan_id)values(curdate(),'"+customerid+"','"+planid+"')";
                
                System.out.println("reg:\t"+insert);
                
                boolean b=con.insert(insert);
                String a="false";
                if(b)
                {
                    a="Boooking Successfull";
                }
                return a;
            }
            
        }
       
             
     catch (SQLException ex) {
        Logger.getLogger(WebServiceNew.class.getName()).log(Level.SEVERE, null, ex);
    }
      return "falsea";      
    } 
    

     @WebMethod(operationName = "getbookoperat")
    public String getbookoperat(@WebParam(name = "custid") String custid) {
        //TODO write your implementation code here:
       JSONArray j=new JSONArray();
        String sele="select * from tbl_booking sc inner join tbl_prodplan c on sc.prodplan_id=c.prodplan_id inner join tbl_product p on c.product_id=p.product_id inner join tbl_plan s on c.plan_id=s.plan_id inner join tbl_custreg cs on sc.custreg_id=cs.custreg_id where sc.custreg_id= '"+custid+"'";
        System.out.println("getPodct:\t"+sele);
        ResultSet r=con.select(sele);
        
        String b,a,c,d,e,f;
       try {
            while(r.next())
            {
                JSONObject jo= new JSONObject();
                
                a=r.getString("product_name");
                c=r.getString("plan_type");
                b=r.getString("prodplan_rate");
                d=r.getString("booking_status");
                e=r.getString("booking_id");
                f=r.getString("booking_paystatus");
                jo.put("prodname",a);
                jo.put("plantype",c);
                jo.put("prodrate",b); 
                jo.put("status",d);
                jo.put("bookingid",e);
                jo.put("paystatus",f);
                j.put(jo);
                
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (JSONException ex) {
        Logger.getLogger(WebServiceNew.class.getName()).log(Level.SEVERE, null, ex);
    }
        return j.toString();
    }
    
    @WebMethod(operationName = "updatoperat")
    public String updatoperat(@WebParam(name = "Id") String Id) {
        //TODO write your implementation code here:
      String upd="update tbl_booking set booking_paystatus=1 where booking_id='"+Id+"'";
      System.out.println(upd);
      boolean b1=con.insert(upd);
       String ab="false";
       if(b1)
       {
           ab="true";
           JSONArray j=new JSONArray();
           String sl="select * from tbl_booking where booking_id='"+Id+"'";
            System.out.println(sl);
            ResultSet rm=con.select(sl);
             String b;
              try {
            while(rm.next())
            {
                JSONObject jo= new JSONObject();
                
                b=rm.getString("custreg_id");
                 System.out.println(b);
                jo.put("custid",b);
                j.put(jo);
                
                String dl="delete from tbl_notify where custreg_id='"+b+"'";
                 System.out.println(dl);
                if(con.insert(dl)){
                      System.out.println(dl);
                    System.out.println("Notification Deleted");
                }
                else{
                    System.out.println("Couldnt delete");
                }
                
                 }       
    } catch (Exception ex) {
       System.out.println(ex);
    }
        System.out.println("json:\t"+j);
    return j.toString();
    }
            
         return ab;
    }
    
    
  @WebMethod(operationName = "Trackpaperboy")
  public String Trackpaperboy (@WebParam(name = "paprid") String paprid, @WebParam(name = "lattitude") String lattitude, @WebParam(name = "longitude") String longitude, @WebParam(name = "plac") String plac) {
  
      //TODO write your implementation code here:
String insert="insert into tbl_location(paperboy_id, location_latitude,location_longitude,location_date,location_time,location_place)values('"+paprid+"','"+lattitude+"','"+longitude+"',curdate(),curtime(),'"+plac+"')";
       System.out.println(insert);
        boolean b= con.insert(insert);
        String a= "false";
        if(b){
            a="true";
        }
        return a;
    }


    @WebMethod(operationName = "ViewLocation")
    public String ViewLocation(@WebParam(name = "Id") String Id) {
        //TODO write your implementation code here:
        
         JSONArray ja=new JSONArray();
        try {
        //TODO write your implementation code here:
        String f="select * from tbl_location l inner join tbl_assignrt ar on l.paperboy_id=ar.paperboy_id inner join tbl_route r on ar.route_id=r.route_id inner join tbl_custreg cu on cu.place_id=r.route_to or cu.place_id=r.route_from where cu.custreg_id='"+Id+"'"; 
       ResultSet r1=con.select(f);
        System.out.println(f);
        if(r1.last())
        {
            
            JSONObject jo=new JSONObject();
            
            String n1=r1.getString("location_latitude");
            String n2=r1.getString("location_longitude");
            String n5=r1.getString("location_place");
            String n3=r1.getString("location_date");
            String n4=r1.getString("location_time"); 
            jo.put("Latti",n1);
            jo.put("Longi",n2);
            jo.put("Dat",n3);
            jo.put("Tim",n4);
            jo.put("Plac",n5);
            ja.put(jo);
                    
              }       
    } catch (Exception ex) {
       System.out.println(ex);
    }
        System.out.println("json:\t"+ja);
    return ja.toString();
    }
    @WebMethod(operationName = "updatoperat1")
    public String updatoperat1(@WebParam(name = "CustId") String CustId) {
        //TODO write your implementation code here:
      String upd="update tbl_booking set booking_paystatus=1 where custreg_id='"+CustId+"'";
      System.out.println(upd);
      boolean b1=con.insert(upd);
       String ab="false";
       if(b1)
       {
           ab="true";
       }
     
        return ab;
    }
    
    @WebMethod(operationName = "Viewroute")
    public String Viewroute(@WebParam(name = "PaperboyId") String PaperboyId) {
        JSONArray j=new JSONArray();
        String sele="select * from tbl_route r inner join tbl_assignrt ar on r.route_id=ar.route_id inner join tbl_place p on p.place_id=r.route_to inner join tbl_place pfrom on pfrom.place_id=r.route_from where paperboy_id='"+PaperboyId+"' ";
        System.out.println("getPodct:\t"+sele);
        ResultSet r=con.select(sele);
        
        String b,a,c;
       try {
            while(r.next())
            {
                JSONObject jo= new JSONObject();
                
                a=r.getString("pfrom.place_name");
                c=r.getString("p.place_name");
                jo.put("placfrom",a);
                jo.put("placto",c);             
                j.put(jo);
                
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (JSONException ex) {
        Logger.getLogger(WebServiceNew.class.getName()).log(Level.SEVERE, null, ex);
    }
        return j.toString();
    }
    
    
    @WebMethod(operationName = "Viewcust")
    public String Viewcust(@WebParam(name = "PaperboyId") String PaperboyId) {
        JSONArray j=new JSONArray();
        String sele="select * from tbl_paperboy pb inner join tbl_assignrt ar inner join tbl_route r inner join tbl_place fplace inner join tbl_custreg cus on ar.paperboy_id=pb.paperboy_id and r.route_id=ar.route_id and (r.route_to=fplace.place_id or r.route_from =fplace.place_id) and (cus.place_id= r.route_to or  cus.place_id=r.route_from) where pb.paperboy_id='"+PaperboyId+"' group by cus.custreg_id ";
        System.out.println("getPodct:\t"+sele);
        ResultSet r=con.select(sele);
        
        String b,a,c;
       try {
            while(r.next())
            {
                String pro=""; 
                JSONObject jo= new JSONObject();
                String selProduct="select * from tbl_booking b inner join tbl_prodplan pp inner join tbl_product p on p.product_id=pp.product_id and pp.prodplan_id=b.prodplan_id where b.custreg_id='"+r.getString("custreg_id")+"' and b.booking_status= '1'";
                ResultSet rsp= con.select(selProduct);
                
                while(rsp.next()){
                    pro= pro+ rsp.getString("product_name")+"\n";
                    
                }
                
                a=r.getString("custreg_name");
                c=r.getString("custreg_hname");
                jo.put("Name",a);
                jo.put("Hname",c); 
                jo.put("product", pro);
                j.put(jo);
                
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (JSONException ex) {
        Logger.getLogger(WebServiceNew.class.getName()).log(Level.SEVERE, null, ex);
    }
        System.out.println("JSONARRAY:\n"+j.toString());
        return j.toString();
    }
    
@WebMethod(operationName = "CustComplaints")
    public String CustComplaints(@WebParam(name = "com") String com, @WebParam(name = "custid") String custid) {
        String ins ="insert into tbl_complaint (com_des,com_date,com_time,custreg_id) values('"+com+"',curdate(),curtime(),'"+custid+"')";
        if(con.insert(ins)){
            return "Complaint Added";
        }
        return "Error";
    }
    
    
    @WebMethod(operationName = "viewcustnotification")
    public String viewcustnotification(@WebParam(name = "custid") String custid) {
        //TODO write your implementation code here: 
        JSONArray ja=new JSONArray();
        try {
        //TODO write your implementation code here:
        String f="select * from tbl_notify where custreg_id='"+custid+"'"; 
       ResultSet r1=con.select(f);
        System.out.println(f);
        while(r1.next())
        {
            
            JSONObject jo=new JSONObject();
            String n1=r1.getString("notify_date");
            String n2=r1.getString("notify_time");
            String n3=r1.getString("notify_msg");
           
            jo.put("Date",n1);
            jo.put("Time",n2);
            jo.put("Msg",n3);
          ja.put(jo);
                    
              }   
         System.out.println("json:\t"+ja);
    return ja.toString();
    } catch (Exception ex) {
       System.out.println(ex);
    }
       return null;
    } 
    
 
     @WebMethod(operationName = "getadvertiseperation")
    public String getadvertiseperation() {
        //TODO write your implementation code here:
        JSONArray j=new JSONArray();
        String sele="select* from tbl_advertise";
        ResultSet r=con.select(sele);
        
        String a,s,b,c;
       try {
            while(r.next())
            {
                JSONObject jo= new JSONObject();
                
                s=r.getString("advertise_id");
                a=r.getString("advertise_type");
                b=r.getString("advertise_width");
                c=r.getString("advertise_height");
                jo.put("advid",s);
                jo.put("advtpe",a);
                 jo.put("advwid",b);
                  jo.put("advheig",c);
                
                j.put(jo);
                
            }
        } catch (SQLException ex) {
            
        } catch (JSONException ex) {
        Logger.getLogger(WebServiceNew.class.getName()).log(Level.SEVERE, null, ex);
    }
        return j.toString();
    }
    
     @WebMethod(operationName = "getrateadvertise")
    public String getrateadvertise(@WebParam(name = "width") String width,@WebParam(name = "height") String height) {
        JSONArray j=new JSONArray();
         String rate="";
        try{
    
        String sel="select * from tbl_advertise where advertise_width='"+width+"' and advertise_height='"+height+"'";
        
         System.out.println(sel);
         
         ResultSet r=con.select(sel);
         while(r.next())
         {
             JSONObject jo=new JSONObject();
             rate=r.getString("advertise_rate");
             jo.put("advrate",rate);
             j.put(jo);
          }
        } catch (SQLException ex) {
            
        } catch (JSONException ex) {
        Logger.getLogger(WebServiceNew.class.getName()).log(Level.SEVERE, null, ex);
    }
      return rate;
         
    }
    
        
@WebMethod(operationName = "insertadvertise")
    public String insertadvertise(@WebParam(name = "type") String type,@WebParam(name = "width") String width,@WebParam(name = "height") String height,@WebParam(name = "rate") String rate) {
        String ins ="insert into tbl_insadv(adv_type,adv_width,adv_height,adv_rate)values('"+type+"','"+width+"','"+height+"','"+rate+"')";
        if(con.insert(ins)){
            
            String sl="select * from tbl_insadv";
            System.out.println(sl);
             ResultSet r=con.select(sl);
            try {
             if(r.last()){
                  
                        String a=r.getString("adv_id");
                        return a;
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(WebServiceNew.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return "Error";
    }

    
  }

   

        
    


 