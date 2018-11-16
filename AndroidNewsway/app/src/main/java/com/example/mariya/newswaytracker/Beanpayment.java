package com.example.mariya.newswaytracker;

/**
 * Created by Mariya on 10/19/2018.
 */

public class Beanpayment {
    String productname,plantype,planrate,status,bookingid,paystatus;

    public String getBookingid() { return bookingid; }
    public void setBookingid(String bookingid) { this.bookingid = bookingid; }

    public String getProductname() { return productname; }

    public void setProductname(String productname) { this.productname = productname; }

    public String getPlantype() { return plantype; }

    public void setPlantype(String plantype) { this.plantype = plantype;
    }

    public String getPlanrate() { return planrate;
    }

    public void setPlanrate(String planrate) { this.planrate = planrate;
    }

    public String getStatus() { return status;
    }

    public void setStatus(String status) { this.status = status;
    }

    public String getPaystatus() {
        return paystatus;  }

    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus;
    }
}

