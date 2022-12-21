// 00:13:45
function solution(case1) {
  const [N, K] = case1.split(" ").map(Number);
  let count = 1;
  let ONE = Array.from({ length: N }, (_v, i) => i + 1);
  let answer = [];
  while (ONE.length > 0) {
    const shiftItem = ONE.shift();
    if (count % K === 0) {
      answer.push(shiftItem);
    } else {
      ONE.push(shiftItem);
    }
    count++;
  }
  return `<${answer.join(", ")}>`;
}

const case1 = `7 3`;

console.log(solution(case1));
