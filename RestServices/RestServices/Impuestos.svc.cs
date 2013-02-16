using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using RestServices.Dominio;
using RestServices.Persistencia;

namespace RestServices
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "Impuestos" in code, svc and config file together.
    public class Impuestos : IImpuestos
    {
        private ImpuestoDAO dao = new ImpuestoDAO();
        public List<Dominio.Impuesto> ListarImpuestos(string dni)
        {
            return dao.ListarImpuestos(dni);
        }
    }
}
