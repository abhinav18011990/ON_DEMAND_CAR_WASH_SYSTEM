import React from 'react';
import web from "../src/Images/Car Wash.gif";
import { NavLink } from 'react-router-dom';
const Home=()=> {
    return (
      <>
           <section id="header" className="">
             <div className="container-fluid">
               <div className="row">
                 <div className="col-10 mx-auto">
                   <div className="row">
                   <div className="col-md-6 pt-5 pt-lg-0 order-2 order-lg-1 d-flex justify-content-center flex-column">
                     <h1><strong className="brand-name">Door to Door Car Wash</strong></h1>
                     <h2 className="my-3">Door to Door Car Wash  offers you an eco-friendly doorstep car wash services at an affordable price. Steam Wash is a complete solution for car washing, car cleaning, auto detailing and dry cleaning services at doorstep; simultaneously it is environment friendly and suitable for saving the precious water.

We would like to extend the concept of steam car wash across the country so that a huge amounts of precious water can be saved as well as clean the vehicle thoroughly without waste water.

Steam cleaning is the process of using steam vapor to clean vehicles exterior and interior. Steam has been an important component of cleaning for decades. Steam wash can sterilize and sanitize your vehicle. Steam Car Wash makes for cleaner, greener, healthier and stunning cars. It has the unique ability to clean and shine your vehicle simultaneously. It also has the ability to kill bacteria, germs, viruses, molds & other microorganisms. After all, Steam Wash is a complete car cleaning solution.</h2>
                     <div className="mt-3">
                       <NavLink to="/service" className="btn-get-stared">
                         Get Started
                       </NavLink>
                     </div>
                   </div>
                   <div className="col-lg-6 order-1 order-lg-2 header-img">
                     <img src={web} className="img-fluid animated" alt="homepage" />
                   </div>
                   </div>
                 </div>
               </div>
             </div>

           </section>
      </>   
    )
};

export default Home;
