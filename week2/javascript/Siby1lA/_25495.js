// 00:26:50
function solution(string) {
  const input = string.split("\n");
  const N = input[0];
  const A = input[1].split(" ");
  const drain = 2;
  let currentPhone = 0;
  let battery = 0;
  let currentBattery = 0;
  for (let i = 0; i < N; i++) {
    if (A[i] !== currentPhone) {
      battery += drain;
      currentBattery = drain;
    } else {
      battery += currentBattery * 2;
      currentBattery *= 2;
    }
    currentPhone = A[i];
    if (battery >= 100) {
      battery = 0;
      currentPhone = 0;
      currentBattery = 0;
    }
  }
  return battery;
}
const string = `7
2 2 2 2 2 2 2`;
console.log(solution(string));
