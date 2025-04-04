function isPrime(n) {
    // Write your code here.
    if (n <= 1) {
        return false;
    }
    for (let i = 2; i <= Math.sqrt(n); i++){
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

module.exports.isPrime = isPrime;
// https://www.naukri.com/code360/problems/check-prime_624934?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
