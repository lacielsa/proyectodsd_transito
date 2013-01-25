using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using System.Web.Services;
using System.Data;
using System.Data.Linq;


namespace ServiceGenes
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "Service1" in code, svc and config file together.
    public class Service1 : IService1
    {
        public string GetData(int value)
        {
            return string.Format("You entered: {0}", value);
        }

        public CompositeType GetDataUsingDataContract(CompositeType composite)
        {
            if (composite == null)
            {
                throw new ArgumentNullException("composite");
            }
            if (composite.BoolValue)
            {
                composite.StringValue += "Suffix";
            }
            return composite;
        }

        [WebMethod]
        public Persona listaDatosPersona(string DNI)
        {
            // List<Persona> ListaPersona=new List<Persona>();
            Persona per = new Persona();
            List<Persona> personas = new List<Persona>();
            using (ReniecDataContext DB = new ReniecDataContext())
            {
                var query = (from p in DB.Personas
                             where p.v_dni == DNI
                             select p);
                personas = query.ToList();
            }
            per = personas[0];

            return per;
        }

    }
}
