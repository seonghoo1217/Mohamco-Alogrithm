//00:58:40
function solution(data) {
  let [N, M, L] = data.split(' ').map(Number);
  let arr = Array.from({ length: N }, v => 0);
  let ballIndex = 0;
  let cnt = 0;
  while (!arr.includes(M)) {
    if (arr[ballIndex] === 0) {
      arr[ballIndex] += 1;
    } else {
      if (arr[ballIndex] % 2 !== 0) {
        if (ballIndex + L >= N) {
          ballIndex = ballIndex + L - N;
          arr[ballIndex] += 1;
        } else {
          ballIndex += L;
          arr[ballIndex] += 1;
        }
      } else {
        if (ballIndex - L < 0) {
          ballIndex = ballIndex - L + N;
          arr[ballIndex] += 1;
        } else {
          ballIndex -= L;
          arr[ballIndex] += 1;
        }
      }
      cnt++;
    }
  }
  return cnt;
}

const case1 = `5 3 2`;
const case2 = `4 1 3`;

console.log(solution(case1));
console.log(solution(case2));
