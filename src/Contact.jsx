import React from 'react';
import { useState } from 'react';

const Contact=()=> {
  const[data,setData]=useState({
    fullname:'',
    phone:'',
    email:'',
    message:'',
  })
  // Get the value entered by user
  const InputEvent=(event)=>{
        const {name,value}=event.target;
        setData((preVal)=>{
            return  {
              ...preVal,
              [name]:value,
            }
        }
        )
  }
  const fromSubmit=(e)=>{
    e.preventDefult();
  }
    return (
      <>
        <div className="my-5">
           <h1 className="text-center">Contact Us</h1>
        </div>
        <div className="container contact_div">
          <div className="col-md-6 col-10 mx-auto">
            <form onSubmit={fromSubmit}>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">Full Name</label>
                    <input type="text" class="form-control" id="exampleFormControlInput1" value={data.fullname} 
                    onChange={InputEvent} name="fullname" placeholder="Enter Your Name"/>
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">Contact Number</label>
                    <input type="number" class="form-control" id="exampleFormControlInput1" value={data.phone}
                    onChange={InputEvent} name="phone" placeholder="Contact Number"/>
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">Email Id</label>
                    <input type="email" class="form-control" id="exampleFormControlInput1" value={data.email} onChange={InputEvent} name="email" placeholder="name@example.com"/>
                </div>
                <div class="mb-3">
                   <label for="exampleFormControlTextarea1" class="form-label">Message</label>
                   <textarea class="form-control" id="exampleFormControlTextarea1" value={data.message} onChange={InputEvent} name="message" rows="3"></textarea>
                </div>
            </form>
            <div class="col-12">
                <button class="btn btn-primary" type="submit">Submit form</button>
          </div>
          </div>
        </div>
      </> 
    )
}

export default Contact;