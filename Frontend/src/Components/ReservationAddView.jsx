import React from "react";
import { Link } from "react-router-dom";
import AddReservation from "./AddReservation";
import NavReception from "./NavReception";

const ReservationAddView =()=>{
    return (
        <>
        <NavReception/>
      <AddReservation/>
        </>
    )
};
export default ReservationAddView;
