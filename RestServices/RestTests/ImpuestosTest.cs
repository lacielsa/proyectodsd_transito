using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Net;
using System.IO;

namespace RestTests
{
    /// <summary>
    /// Summary description for ImpuestosTest
    /// </summary>
    [TestClass]
    public class ImpuestosTest
    {        
        [TestMethod]
        public void ListarImpuestosTest()
        {
            //Listar Impuestos por DNI
            HttpWebRequest req = (HttpWebRequest)WebRequest.Create("http://localhost:55915/Impuestos.svc/Impuestos/45675449");
            req.Method = "GET";
            HttpWebResponse res = (HttpWebResponse)req.GetResponse();
            StreamReader reader = new StreamReader(res.GetResponseStream());
            string impuestos = reader.ReadToEnd();
            Assert.AreEqual("1", impuestos);
        }
    }
}
