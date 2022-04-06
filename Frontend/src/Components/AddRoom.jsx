import React, { Fragment , useEffect , useState } from "react";
import axios from "axios";
import NavManager from "./NavManager";
const AddRoom=()=>{
  useEffect(() => {
    document.title= " Add Room";
  }, [])
  function room1(e){
    e.preventDefault();
    let roomId=document.getElementById("roomId").value;
    let roomType=document.getElementById("roomType").value;
    let availability=document.getElementById("availability").value;
    let price=document.getElementById("price").value;
    axios.post("http://localhost:7008/room/add",{roomId:roomId,roomType:roomType,availability:availability,price:price} );
}
     return(
    <>
    <NavManager/>
    
    <div className="login-form">
    <form onClick={room1}>
      <h1>Add New Staff Member</h1>
      <div className="content">
      <div className="input-field">
          <input id='roomId' placeholder="RoomId" required  />
        </div>
      <div className="input-field">
          <input id='roomType' placeholder="Room Type" required  />
        </div>
        <div className="input-field">
          <input id='availability' placeholder="Availability" required />
        </div>
        <div className="input-field">
          <input id='price' placeholder="Price" required />
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
export default AddRoom;