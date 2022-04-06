import React from "react";
import { Link } from "react-router-dom";
import NavReception from "./NavReception";
import Reservation from "./Reservation";

const ReservationAllView =()=>{
    return (
        <>
        <NavReception/>
        <Reservation/>  
        </>
    )
};
export default ReservationAllView;
