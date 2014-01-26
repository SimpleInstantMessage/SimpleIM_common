package org.simpleim.common.message;

public class LoginFailResponse extends FailureResponse {
        public enum FailReason{
        	 ID_NOT_FOUND,PASSWORD_NOT_RIGHT
        }
        private FailReason fr= null;
		public FailReason getFr() {
			return fr;
		}
		public LoginFailResponse setFr(FailReason fr) {
			this.fr = fr;
			return this;
		}
          
}


