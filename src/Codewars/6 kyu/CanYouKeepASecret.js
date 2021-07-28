function createSecretHolder(secret = 0) {
    return {
        setSecret: function (setValue) {
            secret = setValue;
        },
        getSecret: function () {
            return secret;
        }
   }
};


