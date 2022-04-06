import React from "react";
import { Link } from "react-router-dom";

import AllReservation from "./AllReservation";
import NavManager from "./NavManager";
import NavReception from "./NavReception";
const ReceptionView = () =>{
    return (
        <>
        <NavReception/>
       
        <AllReservation/>
        </>
    )
};
export default ReceptionView;
