import React from "react";
import { useState , useEffect} from "react";
import './card.css';
// import './Button.css';
import axios from "axios";
import Staff from "./Staff";

const Reservation=()=>{

  const getReservationFromServer = () => {
        axios.get('http://localhost:9000/reservation/guestdetails').then(
        (response) => {
          console.log(response.data);
          setReservation(response.data);
        },
        (error) => {
          console.log(error);
        }
        );
      };
      useEffect(() => {
          getReservationFromServer();
          
      }, []);
      const [reservation , setReservation] = useState([]);
      const updateReservation = (roomId) => {
        setReservation(reservation.filter((i) => i.roomId != roomId));
      }

 
  return(
      <>
    <div class="container">
    {
      reservation.map((curElem)=>{
        return(
          <div>
            <div class="card">
    <div class="box">
      <div class="content">
      <tr>
                <td><strong>Name:</strong></td>
                <td>{curElem.name}</td>
            </tr>
            <tr>
                <td><strong>Address:</strong></td>
                <td>{curElem.address}</td>
            </tr>
            <tr>
                <td><strong>No. of days:</strong></td>
                <td>{curElem.days}</td>
            </tr>
            <tr>
                <td><strong>No. of persons:</strong></td>
                <td>{curElem.persons}</td>
            </tr>
       
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
     
    
   
export default Reservation;