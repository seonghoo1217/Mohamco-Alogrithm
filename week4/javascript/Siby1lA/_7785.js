// 00:17:24
function solution(data) {
  const input = data.split("\n");
  const N = Number(input.splice(0, 1).join(""));
  let answer = [];
  for (let i = 0; i < N; i++) {
    const [name, state] = input[i].split(" ");
    if (state === "enter") {
      answer.push(name);
    }
    if (state === "leave") {
      const index = answer.indexOf(name);
      answer.splice(index, 1);
    }
  }
  return answer.sort((a, b) => a - b).join("\n");
}

const case1 = `4
Baha enter
Askar enter
Baha leave
Artem enter`;

console.log(solution(case1));
