using System;
using System.Collections.Generic;
using System.Text;

namespace OKExSDK.Models.Error
{
    public class OKExException : Exception
    {
        public OKExException(string message) : base(message)
        {
        }
    }
}
