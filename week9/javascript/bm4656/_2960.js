//00:40:48
function solution(data) {
  let [N, K] = data.trim().split(' ').map(Number);

  const arr = [];
  for (let i = 2; i <= N; i++) arr.push(i);
  let count = 0;
  let prime;
  let nth;
  while (count < K) {
    prime = arr[0];
    arr.some(v => {
      if (v % prime === 0) {
        arr.splice(arr.indexOf(v), 1);
        nth = v;
        count++;
      }
      if (count === K) return true;
    });
  }
  return nth;
}

const case1 = `7 3`;
const case2 = `15 12`;

console.log(solution(case1));
console.log(solution(case2));
