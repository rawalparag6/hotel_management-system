import React, { Fragment , useEffect , useState } from "react";
import axios from "axios";
import NavManager from "./NavManager";
const Addstaff=()=>{
  useEffect(() => {
    document.title= " Add Staff";
  }, [])
  function s1(e){
    e.preventDefault();
    let staffId=document.getElementById("staffId").value;
    let name=document.getElementById("name").value;
    let email=document.getElementById("email").value;
    let address=document.getElementById("address").value;
    let department=document.getElementById("department").value;
    let salary=document.getElementById("salary").value;
    axios.post("http://localhost:9009/staff/add",{staffId:staffId , name:name,email:email, address:address,department:department,salary:salary} );
}
     return(
    <>
    <NavManager/>
    
    <div className="login-form">
    <form onClick={s1}>
      <h1>Add New Staff Member</h1>
      <div className="content">
      <div className="input-field">
          <input id='staffId' placeholder="StaffId" required  />
        </div>
      <div className="input-field">
          <input id='name' placeholder="Name" required  />
        </div>
        <div className="input-field">
          <input id='email' placeholder="email" required />
        </div>
        <div className="input-field">
          <input id='address' placeholder="Address" required />
        </div>
        <div className="input-field">
          <input id='department' placeholder="Depatment" required />
        </div>
        <div className="input-field">
          <input id='salary' placeholder="Salary" required />
        </div>
      </div>
      <div className="action">
        <button type="submit" >Add</button>
        <button type="reset">Cancle</button>
      </div>
      
      </form>

  </div>
  </>

    )
   
};
export default Addstaff;