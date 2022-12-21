// 00:17:24
function solution(data) {
  const input = data.split("\n");
  const N = Number(input.splice(0, 1).join(""));
  let set = new Set();
  for (let i = 0; i < N; i++) {
    const [name, state] = input[i].split(" ");
    if (state === "enter") {
      set.add(name);
    }
    if (state === "leave") {
      set.delete(name);
    }
  }
  let answer = [...set].sort();
  answer.reverse();
  return answer.join("\n");
}

const case1 = `4
Baha enter
Askar enter
Baha leave
Artem enter`;

console.log(solution(case1));
