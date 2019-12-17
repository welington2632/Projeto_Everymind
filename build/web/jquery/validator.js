$(document).ready(function () {
     $("#formValidation").validate({
         rules:{
             name:{
                 required: true,
                 minlenght: "5"
             },
             email:{
                 requred: true
             }
         }
     })
})