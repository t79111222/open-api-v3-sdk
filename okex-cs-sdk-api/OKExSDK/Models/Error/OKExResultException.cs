using System;
using System.Collections.Generic;
using System.Text;

namespace OKExSDK.Models.Error
{
    public class OKExResultException : Exception
    {
        public ErrorResult ErrorDetails { get; set; }

        public OKExResultException(ErrorResult errorDetails) : base(errorDetails.message)
        {
            ErrorDetails = errorDetails;
        }
    }
}
