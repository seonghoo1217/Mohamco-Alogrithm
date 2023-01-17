//00:08:01
function solution(data) {
  let input = data.trim().split('\n');
  let [N, L] = input[0].split(' ').map(Number);
  const fruits = input[1].split(' ').map(Number);
  fruits.sort((a, b) => a - b);
  fruits.map(x => {
    if (x <= L) {
      L++;
    }
  });
  return L;
}

const case1 = `3 10
10 11 13`;
const case2 = `9 1
9 5 8 1 3 2 7 6 4`;

console.log(solution(case1));
console.log(solution(case2));
