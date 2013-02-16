using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using RestServices.Dominio;
using System.ServiceModel.Web;

namespace RestServices
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "IImpuestos" in both code and config file together.
    [ServiceContract]    
    public interface IImpuestos
    {
        [OperationContract]
        [WebInvoke(Method = "GET", UriTemplate = "Impuestos/{dni}",ResponseFormat=WebMessageFormat.Json)]
        List<Impuesto> ListarImpuestos(string dni);
    }
}
