using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Runtime.Serialization;

namespace RestServices.Dominio
{
    [DataContract]
    public class Impuesto
    {
        [DataMember]
        public string Dni { get; set; }
        [DataMember]
        public string Placa { get; set; }
        [DataMember]
        public string NumCuota { get; set; }
        [DataMember]
        public decimal Multa { get; set; }
        [DataMember]
        public string Fecha { get; set; }
    }
}