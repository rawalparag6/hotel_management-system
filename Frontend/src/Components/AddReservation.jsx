import React from "react"
import axios from "axios";
const AddReservation =()=>{
function r1(e){
    e.preventDefault();
    let roomId=document.getElementById("roomId").value;
    let name=document.getElementById("name").value;
    let address=document.getElementById("address").value;
    let days=document.getElementById("days").value;
    let persons=document.getElementById("persons").value;
    axios.post("http://localhost:9000/reservation/add",{roomId:roomId , name:name, address:address,days:days,persons:persons} );
}
    return (
      <>
      
    <div className="login-form">
    <form >
      <h1>Book Room</h1>  
      <div className="content">
      <div className="input-field">
        <input id='roomId' placeholder="RoomId" required />
      </div>
      <div className="input-field">
        <input id='name' placeholder="Name" required />
      </div>
      <div className="input-field">
        <input id='address' placeholder="Address" required />
      </div>
      <div className="input-field">
        <input id='days' placeholder="days" required />
      </div>
      <div className="input-field">
        <input id='persons' placeholder="persons" required />
      </div>
      </div>
      <div className="action">
     
      <button>< a href='http://localhost:8081/paymentDetails'>Pay and Process</a></button>
      
      </div>
      
      </form>
      
      </div>
      </>
    )

};
export default AddReservation;