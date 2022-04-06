import React from "react";
import { useState , useEffect} from "react";
// import './card.css';
// import './Button.css';
import axios from "axios";
const Room=()=>{
//   const deleteStaff =(staffId) =>{
//     axios.delete("http://localhost:9009/staff/delete/{staffId}").then(
//       (response) => {
//         console.log("deleted");
//       },
//       (error) => {
//         console.log("error"); 
//       }
//     )
//   };
  const getRoomFromServer = () => {
    axios.get('http://localhost:7008/room/find').then(
    (response) => {
      console.log(response.data);
      setRoom(response.data);
    },
    (error) => {
      console.log(error);
    }
    );
  };
  useEffect(() => {
      getRoomFromServer();
      
  }, []);
  const [room , setRoom] = useState([]);
  return(
    <>
    <div class="container">
    {
      room.map((curElem)=>{
        return(
          <div>
        <div class="card">
    <div class="box">
      <div class="content">
      <tr>
            <td><strong>RoomId</strong></td>
            <td>{curElem.roomId}</td>
        </tr>
        <tr>
            <td><strong>Room Type</strong></td>
            <td>{curElem.roomType}</td>
        </tr>
        <tr>
            <td><strong>Availability</strong></td>
            <td>{curElem.availability}</td>
        </tr>
        <tr>
            <td><strong>price</strong></td>
            <td>{curElem.price}</td>
        </tr>
        
      {/* <div className="center" >
     <button className="cta1" onClick={() => { deleteStaff(staff.staffId)}}> Delete</button>
    </div> */}
    </div>
    </div>
    </div>
  </div>

   
        )
      }
      )
    }
     </div>
  
    </>
  )

}

export default Room;