Testing in Soap UI, be sure to remove the wsdl: prefix from the open and close productOrder tags.
The message should look like this:

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:wsdl="http://uciext.ws.hw3/wsdl">
   <soapenv:Header/>
   <soapenv:Body>
      <wsdl:placeOrder>
         <!--Optional:-->
         <wsdl:order>
            <vendorCode>1</vendorCode>
            <vendorName>1</vendorName>
            <orderNumber>1</orderNumber>
            <!--1 or more repetitions:-->
            <productOrder>
               <!--Optional:-->
               <productSku>111003392854</productSku>
               <!--Optional:-->
               <productName>Kindle Fire</productName>
               <!--Optional:-->
               <orderQuantity>3</orderQuantity>
            </productOrder>
            <productOrder>
               <!--Optional:-->
               <productSku>111003392939</productSku>
               <!--Optional:-->
               <productName>Kindle E Ink</productName>
               <!--Optional:-->
               <orderQuantity>3</orderQuantity>
            </productOrder>

         </wsdl:order>
      </wsdl:placeOrder>
   </soapenv:Body>
</soapenv:Envelope>